package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Objects;

/**
 * @author malichun
 * @create 2023/01/03 0003 18:55
 */
@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    BookDao bookDao;

    @Test
    void testGetById(){
        Book getById = bookDao.getById(1);
        System.out.println(getById);

        Book book = bookDao.selectById(1);
        System.out.println(book);
    }

    @Test
    void testSave(){
        Book book = new Book();
        book.setType("测试数据123");
        book.setName("测试数据123");
        book.setDescription("测试数据123");
        bookDao.insert(book);
    }


    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(2);
        book.setType("测试数据1234");
        book.setName("测试数据1234");
        book.setDescription("测试数据1234");
        bookDao.updateById(book);
    }


    @Test
    void testGetAll(){
        System.out.println(bookDao.selectList(null));
    }

    @Test
    void testByPage(){
        Page<Book> page = new Page<>(2,2);
        Page<Book> bookPage = bookDao.selectPage(page, null);
        System.out.println(bookPage.getCurrent());
        System.out.println(bookPage.getSize());
        System.out.println(bookPage.getTotal());
        System.out.println(bookPage.getPages());
        System.out.println(bookPage.getRecords());
    }

    // 条件查询
    @Test
    void testGetBy(){
        String name = "spring";
        // select * from tb_book where name like '%Spring%';
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<>();
        lqw.like(Objects.nonNull(name),Book::getName, name);
        bookDao.selectList(lqw);


    }
}
