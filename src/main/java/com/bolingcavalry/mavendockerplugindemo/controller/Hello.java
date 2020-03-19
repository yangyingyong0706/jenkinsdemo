package com.bolingcavalry.mavendockerplugindemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class Hello {

    @RequestMapping("/")
    public String sayHello(){
    	//修改返回的字符串的内容
        return "123456. Hello jenkins, " + new Date();
    }
    @RequestMapping("/test")
    public String test(){
    	//修改返回的字符串的内容
        return "123456. test  Hello jenkins, " + new Date();
    }
}
