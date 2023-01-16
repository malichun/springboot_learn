package com.itheima.app;

import com.itheima.config.SpringConfig32;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author malichun
 * @create 2023/01/16 0016 12:49
 */
public class App32 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);

    }
}
