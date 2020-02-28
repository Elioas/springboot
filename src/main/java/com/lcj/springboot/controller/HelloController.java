package com.lcj.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Elijah
 * @Date: 2020/2/27 17:36
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello Spring Boot!";
    }
}
