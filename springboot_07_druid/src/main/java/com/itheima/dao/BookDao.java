package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author malichun
 * @create 2023/01/02 0002 0:03
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

    @Select("select * from tbl_book where id = #{id}")
    public Book getById(Integer id);


}
