package com.example.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangyx
 * @version 1.0
 * @date 2021/10/25 15:24
 */
@RestController
public class HelloWorld {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Spring Boot2!";
    }

    @RequestMapping("index")
    public String index(){
        return "使用springboot";
    }
}
