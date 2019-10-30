package com.ytrj.hardwaredata.service;

import com.ytrj.hardwaredata.dao.DianyuanInfoDAO;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Dongye
 * @description : Socket服务器
 * @date : 2019/8/21
 */
@Component
public class Server {

    static final Logger logger = LoggerFactory.getLogger(Server.class);
    /**
     * 是否监听客户端
     */
    private boolean isListen = true;

    @Autowired
    DianyuanInfoDAO dianyuanInfoDAO;

    /**
     * 开启Socket服务器
     */
    public void openSocketServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(8083);
            logger.info("服务端已启动，等待客户端连接..");
            while (isListen) {
                // 未连通前线程阻塞，连通后开启一个socket通道线程后继续监听8083端口
                Socket socket = serverSocket.accept();
                StringBuilder msg = new StringBuilder();
                msg.append("接到设备请求连接，客户端IP:");
                msg.append(socket.getInetAddress().getHostAddress());
                logger.info(msg.toString());
                new SocketThread(socket, dianyuanInfoDAO).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isListen() {
        return isListen;
    }

    public void setListen(boolean listen) {
        isListen = listen;
    }
}
