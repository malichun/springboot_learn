package com.itheima.app;

import com.itheima.bean.Dog;
import com.itheima.config.SpringConfig33;
import com.itheima.config.SpringConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author malichun
 * @create 2023/01/16 0016 12:49
 */
public class App4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
        System.out.println("==========");
        Object dog = ctx.getBean(Dog.class);
        System.out.println(dog);


    }
}
