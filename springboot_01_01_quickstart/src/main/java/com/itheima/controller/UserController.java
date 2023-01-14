package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String save(){
        System.out.println("user save");
        return "{'module':'user save'}";
    }

    @DeleteMapping(value="/users/{id}")
    public String delete(@PathVariable int id){
        System.out.println("user delete..."+id);
        return "{'module':'user delete'}";
    }
}
