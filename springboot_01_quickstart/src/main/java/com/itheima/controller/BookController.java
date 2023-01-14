package com.itheima.controller;

import com.itheima.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Value("${enterprise.name}")
    private String name;

    @Value("${enterprise.subject[0]}")
    private String subject_00;

    @Autowired
    private Environment env;

    @Autowired
    private Enterprise enterprise;

    @GetMapping("/{id}")
    public String getById(@PathVariable("id") Integer id){
        System.out.println("id==>"+id);
        System.out.println(name);
        System.out.println(subject_00);
        System.out.println("-------------");
        System.out.println(env.getProperty("server.port"));
        System.out.println(env.getProperty("enterprise.subject[1]"));
        System.out.println("-------------");
        System.out.println(enterprise);
        return "hello, spring boot!";
    }



}
