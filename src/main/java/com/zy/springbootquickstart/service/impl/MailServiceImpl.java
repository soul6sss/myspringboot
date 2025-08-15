package com.zy.springbootquickstart.service.impl;

import com.zy.springbootquickstart.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendMail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("2782362115@qq.com"); // 发件人（必须和配置文件一致）
        message.setTo(to); // 收件人
        message.setSubject(subject); // 邮件标题
        message.setText(content); // 邮件内容
        mailSender.send(message);
    }
}
