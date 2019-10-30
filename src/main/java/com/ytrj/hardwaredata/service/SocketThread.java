package com.ytrj.hardwaredata.service;

import com.ytrj.hardwaredata.dao.DianyuanInfoDAO;
import com.ytrj.hardwaredata.entity.DianyuanInfo;
import com.ytrj.hardwaredata.entity.DianyuanInfoExample;
import com.ytrj.hardwaredata.utils.HexConverUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author : Ivan
 * @description : 通道线程
 * @date : 2019/8/22
 */

public class SocketThread extends Thread {

    static final Logger logger = LoggerFactory.getLogger(Server.class);

    private BufferedReader bufferedReader;
    private PrintWriter printWriter;
    OutputStream socketWriter;
    InputStream socketRead;
    private Socket socket;
    String imei;
    private DianyuanInfoDAO dianyuanInfoDAO;

    public SocketThread(Socket socket, DianyuanInfoDAO dianyuanInfoDAO) throws IOException {
        this.bufferedReader = new BufferedReader(new InputStreamReader(socket
                .getInputStream()));
        this.printWriter = new PrintWriter(socket.getOutputStream());
        this.socketWriter = socket.getOutputStream();
        this.socketRead = socket.getInputStream();
        this.socket = socket;
        this.dianyuanInfoDAO = SpringBeanUtil.getBean(DianyuanInfoDAO.class);
    }

    @Override
    public void run() {
        String l_imei = this.imei;
        DianyuanInfo dianyuanInfo = new DianyuanInfo();
        while (true) {
            String string = null;
            try {
                // 服客户端消息处理
                byte[] temp = new byte[64];
                int length = this.socketRead.read(temp);
                if (length != -1) {
                    if (temp[0] == 0x01 && temp[1] == 0x03) {
                        int len = (int) HexConverUtil.toDecimalism(String.valueOf(temp[2]), 16);
                        String hexStr = HexConverUtil.BinaryToHexString(temp);
                        dianyuanInfo.setDataTime(new Date());
                        dianyuanInfo.setVoltageA((int) HexConverUtil.toDecimalism(hexStr.substring(6, 10), 16));
                        dianyuanInfo.setVoltageB((int) HexConverUtil.toDecimalism(hexStr.substring(10, 14), 16));
                        dianyuanInfo.setVoltageC((int) HexConverUtil.toDecimalism(hexStr.substring(14, 18), 16));

                        dianyuanInfo.setElectricityA((int) HexConverUtil.toDecimalism(hexStr.substring(18, 22), 16));
                        dianyuanInfo.setElectricityB((int) HexConverUtil.toDecimalism(hexStr.substring(22, 26), 16));
                        dianyuanInfo.setElectricityC((int) HexConverUtil.toDecimalism(hexStr.substring(26, 30), 16));

                        dianyuanInfo.setElectricLeakage1((int) HexConverUtil.toDecimalism(hexStr.substring(30, 34), 16));
                        dianyuanInfo.setElectricLeakage2((int) HexConverUtil.toDecimalism(hexStr.substring(34, 38), 16));
                        dianyuanInfo.setElectricLeakage3((int) HexConverUtil.toDecimalism(hexStr.substring(38, 42), 16));
                        dianyuanInfo.setElectricLeakage4((int) HexConverUtil.toDecimalism(hexStr.substring(42, 46), 16));

                        dianyuanInfo.setTemperature1((int) HexConverUtil.FahrenheitToCentigrade(HexConverUtil.toDecimalism(hexStr.substring(46, 50), 16) + 30));
                        dianyuanInfo.setTemperature2((int) HexConverUtil.FahrenheitToCentigrade(HexConverUtil.toDecimalism(hexStr.substring(50, 54), 16) + 30));
                        dianyuanInfo.setTemperature3((int) HexConverUtil.FahrenheitToCentigrade(HexConverUtil.toDecimalism(hexStr.substring(54, 58), 16) + 30));
                        dianyuanInfo.setTemperature4((int) HexConverUtil.FahrenheitToCentigrade(HexConverUtil.toDecimalism(hexStr.substring(58, 62), 16) + 30));

                        dianyuanInfo.setArcFault((int) HexConverUtil.toDecimalism(hexStr.substring(62, 66), 16));
                        dianyuanInfo.setResistance((int) HexConverUtil.toDecimalism(hexStr.substring(66, 70), 16));
                        dianyuanInfo.setOnline(0);

                        this.dianyuanInfoDAO.insert(dianyuanInfo);

                    } else {
                        if (length != 4) {
                            imei = new String(temp);
                            logger.info("设备IMEI：" + imei);
                            dianyuanInfo.setImei(imei);
                        }
                        byte com[] = HexConverUtil.hexStringToBytes("0103000000104406");
                        this.socketWriter.write(com);
                        this.socketWriter.flush();
                    }
                } else {
                    logger.info("客户端" + this.socket.getInetAddress().getHostAddress() + "断开了连接！");
                    socket.close();
                    break;
                }
            } catch (IOException e) {
                logger.warn(this.socket.getInetAddress().getHostAddress() + "客户端消息监听异常！");
                break;
            }
        }
    }
}
