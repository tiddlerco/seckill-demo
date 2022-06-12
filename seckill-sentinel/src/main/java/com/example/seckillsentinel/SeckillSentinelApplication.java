package com.example.seckillsentinel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SeckillSentinelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillSentinelApplication.class, args);
    }

}
