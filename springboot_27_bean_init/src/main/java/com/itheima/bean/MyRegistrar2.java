package com.itheima.bean;

import com.itheima.service.impl.BookServiceImpl2;
import com.itheima.service.impl.BookServiceImpl3;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author malichun
 * @create 2023/01/16 0016 19:08
 */
public class MyRegistrar2 implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata metadata, BeanDefinitionRegistry registry) {
        // 1.使用做元数据做判定

        // 2.
        BeanDefinition beanDefinition = BeanDefinitionBuilder.rootBeanDefinition(BookServiceImpl3.class).getBeanDefinition();
        registry.registerBeanDefinition("bookService", beanDefinition);
    }
}
