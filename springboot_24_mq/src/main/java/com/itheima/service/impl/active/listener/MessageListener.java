package com.itheima.service.impl.active.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/13 0013 9:34
 */
//@Component
public class MessageListener {

    // 自动处理
    @JmsListener(destination = "order.queue.id")
    @SendTo("order.other.queue.id") // 方法的返回值发送
    public String receive(String id){
        System.out.println("已完成短信发送业务.id: "+id);
        return "new:"+id;
    }

}
