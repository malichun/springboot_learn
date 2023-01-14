package com.itheima.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @author malichun
 * @create 2023/01/07 0007 21:52
 */
public interface BookService extends IService<Book> {
    public boolean save(Book book);
}
