package com.antao.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author     ：antao
 * @date        2022/9/3 14:29
 * @description：
 * @modified By：
 */
@SpringBootApplication
@EnableEurekaClient
public class ManagerSystem {
    private static final Logger logger = LoggerFactory.getLogger(ManagerSystem.class);
    public static void main(String[] args) {
        SpringApplication.run(ManagerSystem.class, args);
        logger.info("ManagerSystem start------------------------------");
    }
}