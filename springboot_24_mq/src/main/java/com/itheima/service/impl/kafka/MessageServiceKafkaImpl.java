package com.itheima.service.impl.kafka;

import com.itheima.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author malichun
 * @create 2023/01/14 0014 15:13
 */
//@Service
public class MessageServiceKafkaImpl implements MessageService {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列(kafka)");
        kafkaTemplate.send("itheima2022",id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
