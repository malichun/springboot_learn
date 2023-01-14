package com.itheima.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author malichun
 * @create 2023/01/01 0001 23:35
 */
@Configuration
public class HelloConfig {
    @Bean
    public ThreadPoolExecutor threadPool(){
        return new ThreadPoolExecutor(2,10,10, TimeUnit.MINUTES,new ArrayBlockingQueue<>(10));
    }
}
