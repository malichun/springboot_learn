package com.itheima.app;

import com.itheima.config.SpringConfig8;
import com.itheima.service.BookService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * 手工注册bean
 */
public class App8 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig8.class);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        bookService.check();
    }
}
