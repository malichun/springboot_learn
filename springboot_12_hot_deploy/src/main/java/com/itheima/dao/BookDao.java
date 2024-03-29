package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @author malichun
 * @create 2022/12/31 0031 18:15
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {
    @Select("select * from tbl_book where id =#{id}")
    public Book getById(Integer id);
}
