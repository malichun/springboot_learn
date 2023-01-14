package com.itheima;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author malichun
 * @create 2023/01/07 0007 21:57
 */
@SpringBootTest
@Transactional // 事务, 事务回滚
//@Rollback(value=true) // 默认回滚, false不回滚
public class DaoTest {

    @Autowired
    private BookService bookService;

    @Test
    void testSave(){
        Book book = new Book();
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");

        bookService.save(book);
    }
}
