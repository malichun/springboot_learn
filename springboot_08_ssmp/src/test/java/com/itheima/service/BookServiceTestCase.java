package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author malichun
 * @create 2023/01/03 0003 20:50
 */
@SpringBootTest
public class BookServiceTestCase {
    @Autowired
    private BookService bookService;
    @Test
    void testGetById(){
        Book book = bookService.getById(1);
        System.out.println(book);
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123333");
        book.setName("测试数据123333");
        book.setDescription("测试数据123333");
        bookService.save(book);
    }


    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(2);
        book.setType("测试数据1233334");
        book.setName("测试数据1233334");
        book.setDescription("测试数据123334");
        bookService.update(book);
    }



    @Test
    void testGetAll(){
        System.out.println(bookService.getAll());
    }

    @Test
    void getGetPage(){
        IPage<Book> page = bookService.getPage(2, 5);
        System.out.println(page);
    }


}
