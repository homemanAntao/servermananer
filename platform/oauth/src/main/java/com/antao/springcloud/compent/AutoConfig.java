package com.antao.springcloud.compent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 强哈希加密
 * @author     ：antao
 * @date        2022/9/3 20:46
 * @description：
 * @modified By：
 */
@Configuration
public class AutoConfig {
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}