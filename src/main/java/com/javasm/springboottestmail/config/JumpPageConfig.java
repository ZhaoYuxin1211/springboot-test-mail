package com.javasm.springboottestmail.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/14-21:47
 * @Since:jdk1.8
 * @Description:
 */
@Configuration
public class JumpPageConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/","login.html");
    }
}
