package com.itheima.service;

import com.itheima.domain.SMSCode;

/**
 * @author malichun
 * @create 2023/01/10 0010 21:16
 */
public interface SMSCodeService {
    public String sendCodeToSMS(String tele);
    public boolean checkCode(SMSCode smsCode);
}
