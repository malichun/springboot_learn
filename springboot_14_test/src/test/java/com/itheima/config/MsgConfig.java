package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malichun
 * @create 2023/01/06 0006 23:34
 */
@Configuration
public class MsgConfig {

    @Bean(name = "sss")
    public String msg(){
        return "bean msg";
    }

}
