package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author malichun
 * @create 2023/01/07 0007 21:30
 */
@Data
@TableName("tbl_book")
public class Book {
    @TableId(type= IdType.AUTO)
    private int id;
    private String name;
    private String type;
    private String description;
}
