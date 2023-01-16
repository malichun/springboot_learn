package com.itheima.acturator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 健康指标
 * @author malichun
 * @create 2023/01/14 0014 21:15
 */
@Component
public class HealthConfig  extends AbstractHealthIndicator {

    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        boolean condition = true;
        if(condition) {
            builder.withDetail("runTime", System.currentTimeMillis());
            Map infoMap = new HashMap();
            infoMap.put("buildTime", "2006");
            builder.withDetails(infoMap);
            //builder.up(); // up
            builder.status(Status.UP);
        }else{
            builder.withDetail("上线了吗?", "你做梦");
            //builder.down();
            //builder.status(Status.DOWN);
            builder.status(Status.OUT_OF_SERVICE);
        }
    }
}
