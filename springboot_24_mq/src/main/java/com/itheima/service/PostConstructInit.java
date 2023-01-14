package com.itheima.service;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.Collections;


/**
 * @author malichun
 * @create 2023/01/14 0014 15:41
 */
@Component
@Order(1)
@Slf4j
public class PostConstructInit implements ApplicationRunner {

    private volatile boolean flag = true;

    @Autowired
    private KafkaConsumer<String,String> kafkaConsumer;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("==============================");
        System.out.println("ApplicationRunner....");
        kafkaConsumer.subscribe(Collections.singletonList("itheima2022"));
        while(flag){
            ConsumerRecords<String,String> records = kafkaConsumer.poll(Duration.ofSeconds(1));
            records.forEach(consumerRecord -> {
                System.out.println("offset:"+consumerRecord.offset()+", data:"+consumerRecord.value());

            });

        }
    }
}
