package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author malichun
 * @create 2023/01/02 0002 0:02
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("tbl_book")
public class Book {
    private Integer id;
    private String type;
    private String name;
    private String description;
}
