package com.itheima.service.impl.kafka;

import com.itheima.service.MessageService;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author malichun
 * @create 2023/01/14 0014 15:34
 */
@Service
public class MessageServiceKafkaImpl2 implements MessageService {



    @Autowired
    private KafkaProducer<String,String> kafkaProducer;

    @Override
    public void sendMessage(String id) {
        kafkaProducer.send(new ProducerRecord<>("itheima2022",String.valueOf(id)));
    }

    @Override
    public String doMessage() {
        return null;
    }
}
