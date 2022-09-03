package com.antao.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author     ：antao
 * @date        2022/9/3 11:13
 * @description：
 * @modified By：
 */
@SpringBootApplication
@EnableEurekaServer //EnableEurekaServer 表示可以让别人注册进来
public class Eurake_7001 {
    public static void main(String[] args) {
        SpringApplication.run(Eurake_7001.class, args);
    }
}