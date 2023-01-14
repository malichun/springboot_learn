package com.itheima.service;

import com.itheima.domain.Book;

import java.util.List;

/**
 * @author malichun
 * @create 2023/01/10 0010 19:42
 */
public interface BookService {
    public boolean save(Book book);
    public Book getById(Integer id);
    public boolean update(Book book);
    public boolean delete(Integer id);
    public List<Book> getAll();
}
