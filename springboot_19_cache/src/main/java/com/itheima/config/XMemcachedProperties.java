package com.itheima.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author malichun
 * @create 2023/01/11 0011 0:18
 */
@Component
@ConfigurationProperties(prefix = "memcached")
@Data
public class XMemcachedProperties {
    private String servers;
    private int poolSize;
    private long opTimeout;
}
