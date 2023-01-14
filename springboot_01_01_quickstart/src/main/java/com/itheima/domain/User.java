package com.itheima.domain;

import lombok.Data;
import org.springframework.context.annotation.Bean;

@Data
public class User {
    private String name;
    private int age;
}
