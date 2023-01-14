package com.itheima;

import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot07TestApplication.class)
class Springboot07TestApplicationTests {

    @Autowired
    BookService bookService;

    @Test
    public void save() {
        bookService.save();
    }

}
