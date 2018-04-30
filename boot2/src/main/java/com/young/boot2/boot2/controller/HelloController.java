package com.young.boot2.boot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping(value = "/rest/hello")
    @ResponseBody
    public String HelloResponse(){
        return "hello world";
    }

    @RequestMapping(value = "/thymleaf/hello")
    public String thymleaf(){
        return "/hello";
    }
}
