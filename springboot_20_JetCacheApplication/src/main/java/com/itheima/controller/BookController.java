package com.itheima.controller;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
