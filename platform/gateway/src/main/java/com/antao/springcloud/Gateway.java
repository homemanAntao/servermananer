package com.antao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author     ：antao
 * @date        2022/9/3 15:20
 * @description：
 * @modified By：
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway {
    public static void main(String[] args) {
        SpringApplication.run(Gateway.class, args);
    }
}