package com.httpx.springboot.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController{

    @GetMapping("/index")
    public ModelAndView index(){
        //返回逻辑视图，逻辑视图通过Thymeleaf模板引擎进行解析
        return new ModelAndView("index");
    }
}