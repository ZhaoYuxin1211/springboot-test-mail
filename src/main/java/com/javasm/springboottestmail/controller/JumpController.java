package com.javasm.springboottestmail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther:ZhaoYuxin
 * @Version:1.0
 * @Date:2022/6/14-21:40
 * @Since:jdk1.8
 * @Description:
 */
@Controller
public class JumpController {

    @GetMapping("/")
    public String jump(){
        return "redirect:login.html";
    }

}
