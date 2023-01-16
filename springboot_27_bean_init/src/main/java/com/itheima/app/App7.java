package com.itheima.app;

import com.itheima.config.SpringConfig6;
import com.itheima.config.SpringConfig7;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 手工注册bean
 */
public class App7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig7.class);
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
        System.out.println("------------");

    }
}
