package com.itheima.service.impl;

import com.itheima.service.MessageService;
import com.itheima.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author malichun
 * @create 2023/01/12 0012 23:07
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;

    @Override
    public void order(String id) {
        // 一些列的操作, 包含各种服务调用, 处理各种业务
        System.out.println("订单的处理开始");
        // 短信消息处理
        messageService.sendMessage(id);

        System.out.println("订单的处理结果");
        System.out.println();
    }
}
