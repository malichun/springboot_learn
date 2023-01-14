package com.itheima.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "enterprise") // 前缀
public class Enterprise {
    private String name;
    private Integer age;
    private String tel;
    private String[] subject;
}
