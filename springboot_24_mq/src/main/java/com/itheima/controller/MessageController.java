package com.itheima.controller;

import com.itheima.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malichun
 * @create 2023/01/12 0012 23:19
 */
@RestController
@RequestMapping("/msgs")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String doMessage(){
        return messageService.doMessage();
    }
}
