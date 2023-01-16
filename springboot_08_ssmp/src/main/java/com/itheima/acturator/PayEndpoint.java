package com.itheima.acturator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * 自定义端点
 * @author malichun
 * @create 2023/01/14 0014 21:45
 */
@Component
@Endpoint(id="pay", enableByDefault = true)
public class PayEndpoint {

    @ReadOperation
    public Object getPay(){
        System.out.println("==================");
        System.out.println("=======pay========");
        System.out.println("==================");
        return new HashMap(){{
           put("level 1","300");
           put("level 2","291");
           put("level 3","666");
        }};
        //return "你支付我快乐";
    }
}
