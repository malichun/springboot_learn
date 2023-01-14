package com.itheima.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author malichun
 * @create 2023/01/03 0003 22:18
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class R {
    /**
     * true 操作成功
     * false 操作失败
     */
    private Boolean flag;
    private Object data;
    private String msg;

    public R(Boolean flag, Object data){
        this.flag = flag;
        this.data = data;
    }
    public R (Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag, String msg) {
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg){
        this(false, msg);
    }
}
