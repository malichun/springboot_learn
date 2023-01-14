package com.itheima;

import com.itheima.config.MsgConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

// 测试测试环境的bean
@SpringBootTest
@Import({MsgConfig.class}) // 追加了一个配置, 局部配置导入
public class ConfigurationTest {
    @Autowired
    @Qualifier("sss")
    private String msg;

    @Test
    void testConfiguration(){
        System.out.println(msg);
    }

}
