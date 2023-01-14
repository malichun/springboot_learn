package com.itheima.testcase.domain;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/07 0007 22:07
 */
@Data
@Component
@ConfigurationProperties(prefix = "testcase.book")
public class BookCase {
    private int id;
    private int id2; // 范围
    private int type;
    private String name;
    private String uuid;
    private long publishTime;
}
