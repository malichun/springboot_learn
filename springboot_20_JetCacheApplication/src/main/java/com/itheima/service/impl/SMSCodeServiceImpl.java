package com.itheima.service.impl;

import com.alicp.jetcache.Cache;
import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.CreateCache;
import com.itheima.domain.SMSCode;
import com.itheima.service.SMSCodeService;
import com.itheima.utils.CodeUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author malichun
 * @create 2023/01/10 0010 21:17
 */
@Service
public class SMSCodeServiceImpl implements SMSCodeService {
    @Autowired
    private CodeUtils codeUtils;

    // remote方案
    //@CreateCache(area = "sms",name="jetCache_", expire = 10, timeUnit = TimeUnit.SECONDS) // 是一个缓存对象, 设定过期时间

    // 本地和远程共存
    @CreateCache(name="jetCache_", expire = 1000, timeUnit = TimeUnit.SECONDS,cacheType = CacheType.LOCAL) // 是一个缓存对象, 设定过期时间
    private Cache<String, String> jetCache;

    @Override
    public String sendCodeToSMS(String tele) {
        String code = codeUtils.generator(tele);
        jetCache.put(tele,code);
        return code;
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = jetCache.get(smsCode.getTele());
        return smsCode.getCode().equals(code);
    }
}
