package com.itheima.bean;

import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/15 0015 19:05
 */
@Component("tom")
// <bean id="abc"
public class Cat {
    public Cat(){

    }

    int age;
    public Cat(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
            "age=" + age +
            '}';
    }
}
