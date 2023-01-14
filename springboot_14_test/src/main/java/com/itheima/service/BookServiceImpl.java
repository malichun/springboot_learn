package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author malichun
 * @create 2023/01/07 0007 21:54
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements BookService{
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }
}
