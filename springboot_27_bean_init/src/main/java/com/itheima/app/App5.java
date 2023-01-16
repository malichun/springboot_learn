package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Dog;
import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig4;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * 手工注册bean
 */
public class App5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        // 上下文容器对象已经初始化完毕后, 手工加载bean
        ctx.registerBean("tom", Cat.class,0);
        ctx.registerBean("tom", Cat.class,1);
        ctx.registerBean("tom", Cat.class,2); // 后面的把前面的覆盖了
        ctx.register(Mouse.class);

        String[] names = ctx.getBeanDefinitionNames();
        Arrays.stream(names).forEach(System.out::println);
        System.out.println("======================");
        Cat cat = ctx.getBean(Cat.class);
        System.out.println(cat);


    }
}
