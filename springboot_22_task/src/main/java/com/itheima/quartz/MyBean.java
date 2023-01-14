package com.itheima.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/12 0012 21:09
 */
@Component
public class MyBean {

    @Scheduled(cron = "0/1 * * * * ?")
    public void print(){
        System.out.println("spring task run..");
    }
}
