package com.itheima;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

/**
 * @author malichun
 * @create 2023/01/08 0008 0:34
 */
@SpringBootTest
public class StringRedisTemplateTest {

    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Test
    void get(){
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        System.out.println(ops.get("name"));

    }

}
