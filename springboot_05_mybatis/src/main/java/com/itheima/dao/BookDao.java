package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author malichun
 * @create 2023/01/02 0002 0:03
 */
@Mapper
public interface BookDao {

    @Select("select * from book where id = #{id}")
    public Book getById(Integer id);

}
