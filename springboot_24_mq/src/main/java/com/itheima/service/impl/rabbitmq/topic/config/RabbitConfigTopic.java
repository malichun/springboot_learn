package com.itheima.service.impl.rabbitmq.topic.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author malichun
 * @create 2023/01/13 0013 19:38
 */
//@Configuration
public class RabbitConfigTopic {


    // 定义存储消息队列的对象
    @Bean
    public Queue topicQueue(){
        // 1.是否持久化
        // 2. 是否当前连接专用, 如果
        // 3.是否删除: 生产者,消费者都不用时自动删除
        return new Queue("topic_queue");
    }

    @Bean
    public Queue topicQueue2(){
        return new Queue("topic_queue2");
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange("topicExchange");
    }

    // 绑定
    @Bean
    public Binding bindingTopic(){
        return BindingBuilder.bind(topicQueue()).to(topicExchange()).with("topic.*.id");// 可以模糊匹配

    }

    // 一个交换机绑定两个queue
    @Bean
    public Binding bindingTopic2(){
        return BindingBuilder.bind(topicQueue2()).to(topicExchange()).with("topic2");
    }

}

