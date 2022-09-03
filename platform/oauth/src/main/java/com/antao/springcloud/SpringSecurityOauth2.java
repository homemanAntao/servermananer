package com.antao.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author     ：antao
 * @date        2022/9/3 21:15
 * @description：
 * @modified By：
 */
@SpringBootApplication
public class SpringSecurityOauth2 {
    private static final Logger logger = LoggerFactory.getLogger(SpringSecurityOauth2.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityOauth2.class, args);
        logger.info("SpringSecurityOauth2 start success-------------------");
    }
}