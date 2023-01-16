package com.itheima.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;




public class MyImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata metadata) {
        //System.out.println("====================="); // @Import所在位置
        //System.out.println("提示: "+metadata.getClassName()); // 提示: com.itheima.config.SpringConfig6
        //System.out.println(metadata.hasAnnotatedMethods("org.springframework.context.annotation.Configuration"));
        //// 获取属性
        //Map<String, Object> attributes = metadata.getAnnotationAttributes("org.springframework.context.annotation.ComponentScan");
        //System.out.println(attributes);
        //System.out.println("=====================");

        // 各种条件的判定, 判断完毕后, 决定是否装载指定的bean
        boolean flag = metadata.hasAnnotatedMethods("org.springframework.context.annotation.Configuration");
        if(flag) {

            return new String[]{"com.itheima.bean.Dog"};
        }else{
            return new String[]{"com.itheima.bean.Cat"};
        }
    }
}
