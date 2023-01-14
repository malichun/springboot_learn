package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malichun
 * @create 2023/01/03 0003 20:43
 */
@Service // 业务层对应的bean
public class BookServiceImpl2 implements BookService {
    @Autowired
    BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return bookDao.insert(book)>0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.updateById(book) >0;
    }

    @Override
    public boolean delete(Integer id) {
       return bookDao.deleteById(id)>0;
    }

    @Override
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    public IPage<Book> getPage(int currentPage, int pageSize) {
        return bookDao.selectPage(new Page<>(currentPage,pageSize),null);
    }
}
