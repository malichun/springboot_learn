package com.itheima.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.domain.Book;
import com.itheima.service.IBookService;
import com.itheima.controller.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


/**
 * @author malichun
 * @create 2023/01/03 0003 21:44
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private IBookService bookService;

    @GetMapping
    public R getAll(){
        return new R(true,bookService.list());
    }

    @PostMapping
    public R save(@RequestBody Book book) throws IOException{
        if(book.getName().equals("123")){
            throw new IOException(""); // 扔个异常
        }
        boolean flag = bookService.save(book);
        return new R(flag,flag?"添加成功^_^":"添加失败-_-");
    }

    @PutMapping
    public R update(@RequestBody Book book){
        return new R(bookService.modify(book));
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable("id") Integer id){
        return new R(bookService.delete(id));
    }

    @GetMapping("/{id}")
    public R getById(@PathVariable("id") Integer id){
        return new R(true,bookService.getById(id));
    }

    @GetMapping("/{currentPage}/{pageSize}")
    public R getPage(@PathVariable("currentPage") int currentPage, @PathVariable("pageSize")int pageSize){
        IPage<Book> page = bookService.getPage(currentPage, pageSize);
        // 如果当前页码值大于了总页码值, 那么重新执行查询操作, 使用最大页码值作为当前页码值
        if(currentPage > page.getPages()){
            page = bookService.getPage(page.getPages(), pageSize);
        }
        return new R(true,page);
    }


}
