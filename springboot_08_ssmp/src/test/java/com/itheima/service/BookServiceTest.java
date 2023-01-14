package com.itheima.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


/**
 * @author malichun
 * @create 2023/01/03 0003 20:50
 */
@SpringBootTest
public class BookServiceTest {
    @Autowired
    private IBookService bookService;
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
        book.setId(3);
        book.setType("测试数据1233aaa");
        book.setName("测试数据12333aa");
        book.setDescription("测试数据123aa");
        bookService.update(book, new QueryWrapper<Book>().lambda().eq(Book::getId, book.getId()));
    }

    @Test
    void testRemove(){
        bookService.removeById(1);
    }


    @Test
    void testGetAll(){
        System.out.println(bookService.list());
    }

    @Test
    void getGetPage(){
        IPage<Book> page = bookService.page(new Page<Book>(2,5));
        System.out.println(page);
    }


}
