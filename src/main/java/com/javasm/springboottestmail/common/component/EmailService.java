package com.javasm.springboottestmail.common.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

/**
 * @Author：liulei
 * @Version：1.0
 * @Date：2022/6/14-17:14
 * @Since:jdk1.8
 * @Description:
 */

@Component
public class EmailService {

    private static Logger logger = LoggerFactory.getLogger(EmailService.class);

    @Autowired
    private JavaMailSender javaMailSender;

    @Async
    public String sendEmail(){

        //异步执行，线程池大小 8

        logger.info("当前线程==============="+Thread.currentThread().getName());

        try {
            TimeUnit.SECONDS.sleep(3);


        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return "okkk";

        //异步执行，多线程执行
//        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
//        simpleMailMessage.setSubject("获取验证码");
//
//
//        String code = UUID.randomUUID().toString().substring(0, 6);
//        simpleMailMessage.setText(code);
//        simpleMailMessage.setFrom("马化腾<wuhandaxuevip@163.com>");
//        simpleMailMessage.setTo("1468549890@qq.com");
//
//        javaMailSender.send(simpleMailMessage);
    }
}
