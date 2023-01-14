package com.itheima;

import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.annotation.Async;

@SpringBootTest(classes = com.itheima.Spring04JunitApplication.class)
class Spring04JunitApplicationTests {
    //1.注入你要测试的对象
    @Autowired
    BookDao bookDao;

    @Async(value="threadPool")
    @Test
    void contextLoads() {
        //2.执行要测试的对象对应的方法
        bookDao.save();
    }

}
