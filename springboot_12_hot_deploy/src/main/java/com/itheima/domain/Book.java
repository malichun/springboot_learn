package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author malichun
 * @create 2022/12/31 0031 18:15
 */
@Data
@TableName("tbl_book")
public class Book {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String name;
    private String type;
    private String description;
}
