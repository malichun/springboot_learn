package com.itheima.config;

import com.itheima.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malichun
 * @create 2023/01/12 0012 20:46
 */
//@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail printJobDetail(){
        // 绑定具体的工作
        return JobBuilder
            .newJob(MyQuartz.class)
            .storeDurably() // 是否持久化
            .build();
    }

    @Bean
    public Trigger printJobTrigger(){
        // 绑定对应的工作明细
        ScheduleBuilder<? extends Trigger> scheduleBuilder= CronScheduleBuilder
            .cronSchedule("0/5 * * * * ?");

        return TriggerBuilder.newTrigger()
            .withSchedule(scheduleBuilder)
            .forJob(printJobDetail())
            .build();
    }
}
