package com.itheima.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/14 0014 15:28
 */
//@Component
public class MessageListener {

    @KafkaListener(topics = "itheima2022")
    public void onMessage(ConsumerRecord<String, String> record){
        System.out.println("已完成短信发送业务(kafka).id:"+record.value()+" offset:"+record.offset());
    }
}
