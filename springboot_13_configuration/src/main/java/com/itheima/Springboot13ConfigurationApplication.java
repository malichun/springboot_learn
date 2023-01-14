package com.itheima;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.config.ServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties(ServerConfig.class)
public class Springboot13ConfigurationApplication {

    @Bean
    @ConfigurationProperties(prefix = "data-source")
    public DruidDataSource dataSource(){
        DruidDataSource ds = new DruidDataSource();
        //ds.setDriverClassName("com.mysql.jdbc.Driver");

        return ds;
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Springboot13ConfigurationApplication.class, args);
        ServerConfig bean = context.getBean(ServerConfig.class);
        System.out.println(bean);
        DruidDataSource ds = context.getBean(DruidDataSource.class);
        System.out.println(ds.getDriverClassName());
    }

}
