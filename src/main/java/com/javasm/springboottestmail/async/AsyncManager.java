package com.javasm.springboottestmail.async;

import com.javasm.springboottestmail.util.SpringContainerComponent;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/15-22:01
 * @Since:jdk1.8
 * @Description:
 */


public class AsyncManager {

    private static ThreadPoolTaskExecutor threadPoolTaskExecutor;

    private static AsyncManager asyncManager;

    public void execute(Runnable runnable){
        threadPoolTaskExecutor.execute(runnable);
    }

    private AsyncManager() {
        threadPoolTaskExecutor = SpringContainerComponent.getBean(ThreadPoolTaskExecutor.class);
        threadPoolTaskExecutor.setCorePoolSize(25);
    }

    public static AsyncManager getInstance(){
        if (asyncManager == null) {
            asyncManager = new AsyncManager();
        }
        return asyncManager;
    }

}
