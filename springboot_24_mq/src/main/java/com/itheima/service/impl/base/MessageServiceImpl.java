package com.itheima.service.impl.base;

import com.itheima.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author malichun
 * @create 2023/01/12 0012 23:11
 */
//@Service
public class MessageServiceImpl implements MessageService {

    private ArrayList<String> messageList = new ArrayList<>();

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已纳入处理队列.id:"+id);
        messageList.add(id);
    }

    @Override
    public String doMessage() {
        String id = messageList.remove(0);
        System.out.println("已完成短信发送业务, id:"+id);
        return id;
    }
}
