package com.itheima;

import com.alicp.jetcache.anno.config.EnableCreateCacheAnnotation;
import com.alicp.jetcache.anno.config.EnableMethodCache;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// jetcache起用缓存的注开关
@EnableCreateCacheAnnotation
// 开启方法缓存, 要和上面的注解一起使用
@EnableMethodCache(basePackages = "com.itheima")
public class Springboot20JetCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot20JetCacheApplication.class, args);
    }

}
