package com.javasm.springboottestmail.controller;

import com.javasm.springboottestmail.common.http.AjaxResult;
import com.javasm.springboottestmail.common.http.RedisKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/14-22:19
 * @Since:jdk1.8
 * @Description:
 */

@RestController
public class EmailCodeController {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @GetMapping("sendEmailCode")
    public AjaxResult getEmailCode(String email){
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setSubject("验证码");
        simpleMailMessage.setText("1234");
        simpleMailMessage.setFrom("me<zhaoyuxin97@foxmail.com>");
        simpleMailMessage.setTo(email);

        javaMailSender.send(simpleMailMessage);

        stringRedisTemplate.opsForValue().set(RedisKey.REDIS_KEY_CODE,"1234",5,TimeUnit.MINUTES);

        return AjaxResult.success("success");
    }
}
