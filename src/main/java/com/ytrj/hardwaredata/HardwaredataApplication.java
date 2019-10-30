package com.ytrj.hardwaredata;

import com.ytrj.hardwaredata.controller.DataSyncController;
import com.ytrj.hardwaredata.onenetmq.MqClient;
import com.ytrj.hardwaredata.service.Server;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author longs
 */
@MapperScan(basePackages = "com.ytrj.hardwaredata.dao")
@SpringBootApplication
@ComponentScan(basePackageClasses = DataSyncController.class)
@ComponentScan(basePackages = {"com.ytrj.hardwaredata.service","com.ytrj.hardwaredata.onenetmq"})
public class HardwaredataApplication {
    public static void main(String[] args) {
        SpringApplication.run(HardwaredataApplication.class, args);
        Server server = new Server();
        MqClient mqClient = new MqClient();
        mqClient.connect();
        server.openSocketServer();
    }
}
