package com.itheima.service.impl;

import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.exception.MemcachedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeoutException;

/**
 * @author malichun
 * @create 2023/01/10 0010 21:17
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {
    @Autowired
    private CodeUtils codeUtils;

    //
    //@Override
    //@CachePut(value = "smsCode", key= "#tele") // 缓存put
    //public String sendCodeToSMS(String tele) {
    //    return codeUtils.generator(tele);
    //}
    //
    //@Override
    //public boolean checkCode(SMSCode smsCode) {
    //    // //取出内存中的验证码与传递过来的验证码比对, 如果相同返回true
    //    String code = smsCode.getCode();
    //    String cacheCode = codeUtils.get(smsCode.getTele());
    //    return code.equals(cacheCode);
    //}

    // 以下是springboot中使用xmemcached
    @Autowired
    private MemcachedClient memcachedClient;
    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        try {
            memcachedClient.set(tele, 0, code);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = null;
        try {
            code = memcachedClient.get(smsCode.getTele()).toString();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return smsCode.getCode().equals(code);
    }
}
