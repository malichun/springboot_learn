package com.itheima.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author malichun
 * @create 2023/01/03 0003 21:07
 */
@Service
public class BookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean saveBook(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    public boolean modify(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public IPage<Book> getPage(long currentPage, long pageSize) {
        return bookDao.selectPage(new Page<>(currentPage,pageSize), null);
    }
}
