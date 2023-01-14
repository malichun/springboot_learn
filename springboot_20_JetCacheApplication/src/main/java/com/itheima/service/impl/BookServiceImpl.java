package com.itheima.service.impl;

import com.alicp.jetcache.anno.*;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Cached(name="book_",key="#id",expire = 3600,cacheType = CacheType.REMOTE) // 方法缓存
    //@CacheRefresh(refresh = 5)
    public Book getById(Integer id) {
        Book queryBook =  bookDao.selectById(id);
        return queryBook;
    }

    @Override
    @CacheUpdate(name="book_", key="#book.id",value="#book")
    public boolean update(Book book) {
        return bookDao.updateById(book) > 0 ;
    }

    @Override
    @CacheInvalidate(name="book_",key = "#id")
    public boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }
}
