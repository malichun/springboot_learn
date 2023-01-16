package com.itheima.config;

import com.itheima.bean.Dog;
import org.springframework.context.annotation.Import;

// 导入的方式
// Dog类上面没有
@Import(value = {Dog.class, DbConfig.class})
public class SpringConfig4 {

}
