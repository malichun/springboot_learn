package com.itheima.config;

import com.itheima.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//导入xml, 加载bean, 系统迁移
@Configuration(proxyBeanMethods = true) // 是否代理
public class SpringConfig33 {

    @Bean
    public Cat cat(){
        return new Cat();
    }

}
