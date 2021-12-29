package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient//代表自己是一个服务提供方
public class SpringcloudMapApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudMapApplication.class, args);

    }
}