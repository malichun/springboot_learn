package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @author malichun
 * @create 2023/01/15 0015 19:11
 */
public class App2 {
    public static void main(String[] args) {
        // 通过xml获取注解的bean
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext2.xml");
        System.out.println("==================");
        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);

    }
}
