package com.example.seckillgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeckillGatewayApplication {

    public static void main(String[] args) {
        //不设置的化sentinel控制台不会显示网关相关流控选项
        System.setProperty("csp.sentinel.app.type", "1");
        SpringApplication.run(SeckillGatewayApplication.class, args);
    }

}
