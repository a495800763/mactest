package com.example.springboottest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class IndexController {
    @RequestMapping("hello")
    public String hello (){
        return "hello world";

    }
}
