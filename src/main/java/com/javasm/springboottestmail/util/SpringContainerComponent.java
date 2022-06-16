package com.javasm.springboottestmail.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/15-17:17
 * @Since:jdk1.8
 * @Description:
 */

@Component
public class SpringContainerComponent implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext_) throws BeansException {
        applicationContext = applicationContext_;
    }

    public static <T>T getBean(Class<T> clazz){
        return applicationContext.getBean(clazz);
    }
}
