package com.itheima.controller;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

/**
 * @author malichun
 * @create 2023/01/10 0010 19:46
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    //private HashMap<Integer, Book> cache = new HashMap<>();


    //@GetMapping("/{id}")
    //public Book getById(@PathVariable("id") Integer id){
    //    // 如果当前缓存中没有本次要查询的数据, 则进行查询, 否则直接从缓冲中获取数据返回
    //    Book book = cache.get(id);
    //    if(book == null){
    //        Book queryBook = bookService.getById(id);
    //        cache.put(id, queryBook);
    //        return queryBook;
    //    }else {
    //        return book;
    //    }
    //}

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") Integer id){
        return bookService.getById(id);
    }

    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

    @PostMapping
    public boolean save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return bookService.delete(id);
    }



}
