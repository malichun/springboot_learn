package com.itheima.config;

import com.itheima.bean.MyPostProcessor;
import com.itheima.bean.MyRegistrar;
import com.itheima.bean.MyRegistrar2;
import com.itheima.service.impl.BookServiceImpl1;
import org.springframework.context.annotation.Import;

@Import({ BookServiceImpl1.class, MyRegistrar2.class, MyRegistrar.class, MyPostProcessor.class}) // 配置顺序, 后面配置
public class SpringConfig8 {

}
