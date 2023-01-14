package com.itheima.service.impl.rabbitmq.direct.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malichun
 * @create 2023/01/13 0013 19:38
 */
//@Configuration
public class RabbitConfigDirect {


    // 定义存储消息队列的对象
    @Bean
    public Queue directQueue(){
        // 1.是否持久化
        // 2. 是否当前连接专用, 如果
        // 3.是否删除: 生产者,消费者都不用时自动删除
        return new Queue("direct_queue");
    }

    @Bean
    public Queue directQueue2(){
        return new Queue("direct_queue2");
    }

    @Bean
    public DirectExchange directExchange(){
        return new DirectExchange("directExchange");
    }

    // 绑定
    @Bean
    public Binding bindingDirect(){
        return BindingBuilder.bind(directQueue()).to(directExchange()).with("direct");
    }

    // 一个交换机绑定两个queue
    @Bean
    public Binding bindingDirect2(){
        return BindingBuilder.bind(directQueue2()).to(directExchange()).with("direct2");
    }

}

