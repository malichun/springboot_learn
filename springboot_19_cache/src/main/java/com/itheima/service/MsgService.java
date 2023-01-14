package com.itheima.service;

/**
 * @author malichun
 * @create 2023/01/10 0010 19:57
 */
public interface MsgService {
    public String get(String tele);

    public boolean check(String tele, String code);
}
