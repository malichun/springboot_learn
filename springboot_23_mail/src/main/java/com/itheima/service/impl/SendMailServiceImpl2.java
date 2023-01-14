package com.itheima.service.impl;

import com.itheima.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author malichun
 * @create 2023/01/12 0012 21:25
 */
@Service
public class SendMailServiceImpl2 implements SendMailService {

    @Autowired
    private JavaMailSender javaMailSender;

    // 发送人
    private String from = "hc_monitor888@126.com";
    // 接收人
    private String to = "malichun0926@qq.com";
    // 标题
    private String subject = "测试邮件";
    // 正文
    private String context = "<a href='https://www.itcast.cn'>点开有惊喜</a>";

    // 发送多部邮件
    @Override
    public void sendMail() {

        MimeMessage message = javaMailSender.createMimeMessage();

        try {
            MimeMessageHelper helper = new MimeMessageHelper(message,true);
            helper.setFrom(from+"(小甜甜)");
            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(context,true);

            // 添加附件
            File file = new File("D:\\projects\\springboot\\springboot_23_mail\\src\\main\\resources\\application.yml");
            helper.addAttachment(file.getName(), file);


            javaMailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
