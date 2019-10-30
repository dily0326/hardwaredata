package com.ytrj.hardwaredata.onenetmq;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.protobuf.InvalidProtocolBufferException;
import com.ytrj.hardwaredata.dao.YanganInfoDAO;
import com.ytrj.hardwaredata.entity.YanganInfo;
import com.ytrj.hardwaredata.service.SpringBeanUtil;
import com.ytrj.hardwaredata.service.YanganService;
import com.ytrj.hardwaredata.utils.HexConverUtil;
import java.util.Date;
import org.eclipse.paho.client.mqttv3.*;

import java.text.SimpleDateFormat;
import java.util.logging.Logger;


/**
 * @author dongye
 */
public class PushCallback implements MqttCallback {

    private IMqttAsyncClient Client;
    private static final Logger logger = Logger.getLogger(PushCallback.class.getCanonicalName());
    private MqClient mqClient;
    private int reConnTimes = 0;
    private YanganService yanganService;

    public PushCallback(MqClient client) {

        mqClient = client;
        yanganService = SpringBeanUtil.getBean(YanganService.class);
    }

    @Override
    public void connectionLost(Throwable cause) {
        logger.info("connect is losted,and try to reconnect,cause = " + cause.getMessage());
        cause.printStackTrace();
        while (true) {
            if (mqClient.reConnect()) {
                break;
            }
            try {
                //前20次每秒重连一次
                if (reConnTimes++ > 20) {
                    Thread.sleep(1000);
                } else {
                    //超过20次后没10s重连一次
                    Thread.sleep(10000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void messageArrived(String topic, MqttMessage message) throws InvalidProtocolBufferException {
        byte[] payload = message.getPayload();
        OnenetMq.Msg obj = OnenetMq.Msg.parseFrom(payload);
        long at = obj.getTimestamp();
        long msgid = obj.getMsgid();
        String body = new String(obj.getData().toByteArray());

        SimpleDateFormat slf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = slf.format(at);

        JSONObject jsonObject = JSONObject.parseObject(body);
        try {
            String l_body = jsonObject.getString("body");
            JSONObject appJson = JSONObject.parseObject(jsonObject.getString("appProperty"));
            String stream = appJson.getString("datastream");
            stream = stream.substring(stream.length() - 5);
            if (stream.equals("26244")) {
                String deviceId = appJson.getString("deviceId");
                String dataTimestamp = appJson.getString("dataTimestamp");
                YanganInfo yanganInfo = new YanganInfo();
                yanganInfo.setDeviceid(deviceId);
                yanganInfo.setDataStream(Integer.valueOf(stream));
                yanganInfo.setDataUpdateTime(new Date(Long.parseLong(dataTimestamp)));
                yanganInfo.setDataTimestamp(new Date(Long.parseLong(dataTimestamp)));
                yanganInfo.setMessage(l_body);
                yanganInfo.setElectricQuantity((int) HexConverUtil.toDecimalism(HexConverUtil.hex2Binary(l_body.substring(8, 10)).substring(1, 8), 2));
                yanganInfo.setSignalQuality(0);
                if((int) HexConverUtil.toDecimalism(HexConverUtil.hex2Binary(l_body.substring(12, 14)).substring(5, 7), 2) == 0){
                    yanganInfo.setDeviceState((int) HexConverUtil.toDecimalism(HexConverUtil.hex2Binary(l_body.substring(12, 14)).substring(0, 3), 2));
                }else{
                    yanganInfo.setDeviceState(0);
                }
                yanganService.insertOrUpdate(yanganInfo);
            }
        } catch (Exception e) {
            logger.info("设备数据解析失败！");
        }
    }


    @Override
    public void deliveryComplete(IMqttDeliveryToken token) {
        Client = token.getClient();
    }
}
