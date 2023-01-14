package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author malichun
 * @create 2022/12/31 0031 17:46
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("book service is running...");
    }
}
