package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig4;
import com.itheima.config.SpringConfig6;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 手工注册bean
 */
public class App6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig6.class);
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
        System.out.println("------------");

    }
}
