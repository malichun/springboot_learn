package com.itheima.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.domain.Book;

/**
 * @author malichun
 * @create 2023/01/03 0003 21:05
 */
public interface IBookService extends IService<Book> {

    boolean saveBook(Book book);

    boolean modify(Book book);

    boolean delete(Integer id);

    IPage<Book> getPage(long currentPage, long pageSize);
}
