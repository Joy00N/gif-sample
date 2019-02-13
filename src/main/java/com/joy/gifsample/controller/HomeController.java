package com.joy.gifsample.controller;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "Welcome Home!";
    }

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
