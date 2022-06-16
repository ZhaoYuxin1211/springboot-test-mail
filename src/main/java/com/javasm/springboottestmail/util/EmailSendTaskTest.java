package com.javasm.springboottestmail.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/15-22:35
 * @Since:jdk1.8
 * @Description:
 */
public class EmailSendTaskTest {

    private static Logger logger = LoggerFactory.getLogger(EmailSendTaskTest.class);

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(10);
        for (int i=0;i<100;i++){
            scheduledThreadPoolExecutor.schedule(new Runnable() {
                @Override
                public void run() {
                    logger.info(Thread.currentThread().getName());
                }
            }, 0,TimeUnit.SECONDS);
        }

    }
}
