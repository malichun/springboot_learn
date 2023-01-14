package com.itheima.service.impl.rabbitmq.direct;

import com.itheima.service.MessageService;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author malichun
 * @create 2023/01/13 0013 19:32
 */
//@Service
public class MessageServiceRabbitmqDirectImpl implements MessageService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列(rabbitmq direct).id:" + id);
        amqpTemplate.convertAndSend(
            "directExchange", // 交换机名称
            "direct", //配置
            id
        );
    }

    @Override
    public String doMessage() {
        //System.out.println("已完成短信发送业务, id:"+id);
        return null;
    }
}
