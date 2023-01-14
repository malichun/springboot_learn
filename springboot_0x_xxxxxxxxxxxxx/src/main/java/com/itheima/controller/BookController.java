package com.itheima.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author malichun
 * @create 2022/12/13 0013 20:13
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");
        return "springboot is running....";
    }

}
