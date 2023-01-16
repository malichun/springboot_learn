package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author malichun
 * @create 2023/01/15 0015 19:11
 */
public class App1 {
    public static void main(String[] args) {
        // 使用xml初始化bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext1.xml");
        Cat cat = ctx.getBean("cat", Cat.class); // 根据名称获取bean
        System.out.println(cat);
        Dog dog = ctx.getBean(Dog.class); // 根据类型获取bean
        System.out.println(dog);
        System.out.println("==================");
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);

    }
}
