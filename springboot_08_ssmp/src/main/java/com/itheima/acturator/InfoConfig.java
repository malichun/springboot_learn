package com.itheima.acturator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * info端点
 * @author malichun
 * @create 2023/01/14 0014 21:11
 */
@Component
public class InfoConfig implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("runTime", System.currentTimeMillis());
        Map infoMap = new HashMap();
        infoMap.put("buildTime", "2006");
        builder.withDetails(infoMap);
    }
}
