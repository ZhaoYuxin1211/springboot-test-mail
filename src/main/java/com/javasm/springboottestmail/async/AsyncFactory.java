package com.javasm.springboottestmail.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/15-22:17
 * @Since:jdk1.8
 * @Description:
 */
public class AsyncFactory {

    private static Logger logger = LoggerFactory.getLogger(AsyncManager.class);

    public static Runnable sendMail(){
        Runnable runnable =() ->{
            logger.info(Thread.currentThread().getName());
        };

        return runnable;
    }

}
