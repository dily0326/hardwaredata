package com.ytrj.hardwaredata.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ytrj.hardwaredata.dao.YanganInfoDAO;
import com.ytrj.hardwaredata.entity.YanganInfo;
import com.ytrj.hardwaredata.entity.YanganInfoExample;
import com.ytrj.hardwaredata.service.SmokeService;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @description : 烟感服务层实体类
* @author :     Dongye
* @date : 2019/9/23
*/
@Service
public class SmokeServiceImpl implements SmokeService {

    private static Logger logger = LoggerFactory.getLogger(SmokeServiceImpl.class);

    @Autowired
    YanganInfoDAO yanganInfoDAO;

    @Override
    public void TryToUpdateDate(String message) {
        logger.info("message：\t" + message);

        JSONObject msg = JSONObject.parseObject(message);
        JSONObject content = JSONObject.parseObject(msg.getString("msg"));
        YanganInfo yanganInfo = new YanganInfo();

        logger.info("content：\t" + content);

        /**
         * 根据dviceId 查询数据是否存在
         */
        String deviceId = content.getString("dev_id");
        YanganInfoExample yanganInfoExample = new YanganInfoExample();
        yanganInfoExample.createCriteria().andDeviceIdEqualTo(deviceId);
        List<YanganInfo> yanganInfoList = yanganInfoDAO.selectByExample(yanganInfoExample);
        yanganInfoExample.clear();

        /**
         * 获取并填充数据
         */
        String time = content.getString("at");
        yanganInfo.setDataUpdateTime(new Date(Long.parseLong(time)));
        yanganInfo.setDataTimestamp(new Date(Long.parseLong(time)));
        Integer msgType = content.getInteger("type");
        yanganInfo.setDeviceid(deviceId);

        if(msgType == 1){
            //消息类型为1时 是设备数据上传
            String stream = content.getString("ds_id");
            stream = stream.substring(stream.length() - 5);
            if (stream.equals("26244")){
                String body = content.getString("value");
                logger.info("value：\t" + body);
            }
        }else{
            //消息类型为2时 是设备在线状态更新
            Integer status = content.getInteger("status");
            yanganInfo.setDeviceOnline(status);
        }

        if (yanganInfoList.isEmpty()) {
            /**
             * 设备不存在添加 新设备数据
             */
            yanganInfoDAO.insert(yanganInfo);
        } else {
            /**
             * 设备已存在 更新设备数据
             */
            for (int i = 0; i < yanganInfoList.size(); i++) {

                yanganInfo.setId(yanganInfoList.get(i).getId());
                yanganInfoDAO.updateByPrimaryKey(yanganInfo);
                //yanganInfoExample.clear();
            }
        }
    }
}
