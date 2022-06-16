package com.javasm.springboottestmail.common.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.task.TaskExecutorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * @Author：liulei
 * @Version：1.0
 * @Date：2022/6/14-17:28
 * @Since:jdk1.8
 * @Description:
 */
@Configuration
public class AsyncConfig {
    @Bean
    public ThreadPoolTaskExecutor applicationTaskExecutor(TaskExecutorBuilder builder) {
        ThreadPoolTaskExecutor threadPoolTaskExecutor = builder.build();
        threadPoolTaskExecutor.setCorePoolSize(25);
        threadPoolTaskExecutor.setMaxPoolSize(50);

        return threadPoolTaskExecutor;
    }
}
