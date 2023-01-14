package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("tbl_book")
public class Book implements Serializable {
    @TableId(type= IdType.AUTO)
    private Integer id;
    private String type;
    private String name;
    private String description;
}
