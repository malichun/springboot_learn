package com.itheima.controller;

import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author malichun
 * @create 2023/01/10 0010 21:18
 */
@RestController
@RequestMapping("/sms")
public class SMSCodeController {

    @Autowired
    private SMSCodeService smsCodeService;

    @GetMapping
    public String getCode(String tele){
        String code =smsCodeService.sendCodeToSMS(tele);
        return code;
    }

    @PostMapping
    public boolean checkCode(SMSCode smsCode){
        return smsCodeService.checkCode(smsCode);
    }

}
