package com.itheima;

import com.itheima.config.MPConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import java.util.Arrays;

@SpringBootApplication
@Import(MPConfig.class)
public class SSPMApplication {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        // SpringApplication.run(SSPMApplication.class, args);
        // 可以在启动boot程序时, 断开读取外部临时配置对应的入口, 也就是去掉读取外部参数的形参
        SpringApplication.run(SSPMApplication.class);
    }

}
