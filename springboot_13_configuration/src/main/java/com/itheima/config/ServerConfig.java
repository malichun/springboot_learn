package com.itheima.config;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * @author malichun
 * @create 2023/01/06 0006 21:31
 */
//@Component
@Data
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {
    private String ipAddress;
    @Max(value=8888,message = "最大值不能超过8888")
    @Min(value=202, message = "最小值不能超过202")
    private Integer port;
    private long timeout;
    // 时间单位
    @DurationUnit(ChronoUnit.HOURS)
    private Duration serverTimeOut;
    // 大小单位
    //@DataSizeUnit(value= DataUnit.GIGABYTES)
    private DataSize dataSize;
}
