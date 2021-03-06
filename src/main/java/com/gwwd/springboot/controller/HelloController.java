package com.gwwd.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @RequestMapping({"/","/index.html"})
    public String index(){
        return "login";

    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello world";
    }

    //查出用户数据,在页面现实
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello", "<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu"));
        return "success";
    }
}
