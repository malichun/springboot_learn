package com.itheima.config;

import com.itheima.bean.Dog;
import com.itheima.bean.DogFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author malichun
 * @create 2023/01/16 0016 12:46
 */
@Configuration
@ComponentScan({"com.itheima.bean","com.itheima.config"})
public class SpringConfig3 {

    @Bean
    public DogFactoryBean dog(){
        return new DogFactoryBean();
    }
}
