package com.itheima.service.impl;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malichun
 * @create 2023/01/10 0010 19:44
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    @Cacheable(value="cacheSpace", key = "#id")
    public Book getById(Integer id) {
        Book queryBook =  bookDao.selectById(id);
        return queryBook;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.updateById(book) > 0 ;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
