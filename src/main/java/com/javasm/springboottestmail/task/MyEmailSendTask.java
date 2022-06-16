package com.javasm.springboottestmail.task;

import com.javasm.springboottestmail.async.AsyncFactory;
import com.javasm.springboottestmail.async.AsyncManager;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/15-22:24
 * @Since:jdk1.8
 * @Description:
 */

@Component
public class MyEmailSendTask {

    @Scheduled(cron = "0/5 * * * * *")
    public void sendEmailTask(){
        for(int i=0; i<3; i++) {
            AsyncManager.getInstance().execute(AsyncFactory.sendMail());
        }
    }

}
