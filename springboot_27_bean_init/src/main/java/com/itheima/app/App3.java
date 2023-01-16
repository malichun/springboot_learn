package com.itheima.app;

import com.itheima.config.SpringConfig3;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author malichun
 * @create 2023/01/16 0016 12:49
 */
public class App3 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig3.class);
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);

        System.out.println(ctx.getBean("dog")); // com.itheima.bean.Dog@30b7c004
        System.out.println(ctx.getBean("dog"));
        System.out.println(ctx.getBean("dog"));
        System.out.println(ctx.getBean("dog").getClass()); //class com.itheima.bean.Dog
    }
}
