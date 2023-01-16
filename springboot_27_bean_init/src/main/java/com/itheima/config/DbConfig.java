package com.itheima.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/15 0015 19:36
 */
//@Component
//@Configuration // 专门配置的声明, 和@Componment一样
public class DbConfig {

    // 定义第三方bean
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }

}
