package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
@RequestMapping("/books")
public class BookController2 {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public List<Book> getAll(){
        return bookService.list();
    }

    @PostMapping
    public boolean save(@RequestBody Book book){
       return bookService.save(book);
    }

    @PutMapping
    public Boolean update(@RequestBody Book book){
        return bookService.modify(book);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable("id") Integer id){
        return bookService.getById(id);
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public IPage<Book> getPage(@PathVariable("currentPage") int currentPage, @PathVariable("pageSize")int pageSize){
        return bookService.getPage(currentPage,pageSize);
    }


}
