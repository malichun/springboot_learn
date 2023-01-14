package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author malichun
 * @create 2023/01/07 0007 22:43
 */
@Mapper
public interface BookDao extends BaseMapper<Book> {

}
