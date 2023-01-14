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
        // 关闭热部署
        System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(SSPMApplication.class);
    }

}
