package com.itheima.app;

import com.itheima.config.SpringConfig32;
import com.itheima.config.SpringConfig33;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author malichun
 * @create 2023/01/16 0016 12:49
 */
public class App33 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig33.class);
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);

        System.out.println("------------------------------");
        SpringConfig33 springConfig33 = ctx.getBean(SpringConfig33.class);
        System.out.println(springConfig33.cat());
        System.out.println(springConfig33.cat());
        System.out.println(springConfig33.cat());
        System.out.println();


    }
}
