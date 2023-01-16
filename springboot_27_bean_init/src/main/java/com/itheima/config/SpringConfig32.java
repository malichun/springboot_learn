package com.itheima.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Component;

//导入xml, 加载bean, 系统迁移
@Configuration
@Component
@ImportResource("applicationContext1.xml")
public class SpringConfig32 {

}
