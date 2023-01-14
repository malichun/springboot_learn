package com.itheima.service.impl;

import com.itheima.service.MsgService;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/**
 * @author malichun
 * @create 2023/01/10 0010 19:58
 */
@Service
public class MsgServiceImpl implements MsgService {
    private HashMap<String,String> cache = new HashMap<>();

    @Override
    public String get(String tele) {
        String code = tele.substring(tele.length() - 6);
        cache.put(tele, code);
        return code;
    }

    @Override
    public boolean check(String tele, String code) {
        String queryCode = cache.get(tele);
        return code.equals(queryCode);
    }
}
