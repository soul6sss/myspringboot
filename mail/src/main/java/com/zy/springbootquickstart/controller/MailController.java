package com.zy.springbootquickstart.controller;

import com.zy.springbootquickstart.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mail")
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/send")
    public String sendMail() {
        mailService.sendMail("2782362115@qq.com", "测试邮件", "你好，这是一封测试邮件！");
        return "邮件已发送";
    }
}
