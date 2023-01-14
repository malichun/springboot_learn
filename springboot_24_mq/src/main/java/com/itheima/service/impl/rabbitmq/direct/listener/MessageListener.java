package com.itheima.service.impl.rabbitmq.direct.listener;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/13 0013 19:48
 */
//@Component
public class MessageListener {

    // 监听器
    @RabbitListener(queues="direct_queue")
    public void receive(String id){
        System.out.println("已完成短信发送业务(rabbitmq direct).id: "+id);

    }
}
