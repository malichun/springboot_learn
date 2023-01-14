package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author malichun
 * @create 2022/12/31 0031 18:15
 */
@Mapper
public interface BookDao {
    @Select("select * from book where id =#{id}")
    public Book getByIe(Integer id);
}
