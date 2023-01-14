package com.itheima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.xml.transform.Source;

/**
 * @author malichun
 * @create 2022/12/13 0013 20:13
 */
@RestController
@RequestMapping("/books")
public class BookController {

    // 读取yml数据中的单一数据
    @Value("${country}")
    private String country1;

    @Value("${user.name}")
    private String name1;

    // 读取数组
    @Value("${likes[1]}")
    private String likes1;

    // 读取对象数组
    @Value("${users[1].age}")
    private String age1;

    @Value("${server.port}")
    private String port;

    @Value("${tempDir}")
    private String tempDir;

    @Autowired
    private Environment env;

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");

        System.out.println("country1:"+ country1);
        System.out.println("name1:"+name1);
        System.out.println("likes1:"+likes1);
        System.out.println("age1:"+age1);
        System.out.println("port:"+port);
        System.out.println("tempDir:"+tempDir);
        return "springboot is running....";
    }

}
