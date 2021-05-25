package org.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

@RestController
//@RestController包含 @ResponseBody @Controller,可以简化过程。

//@ResponseBody
//由于要处理多个请求返回，所以将@ResponseBody写到外面
//@Controller
public class HelloController {

    //由于返回的字符串是直接写给浏览器的，所以加注释@ResponseBody
    //@ResponseBody
    //返回映射请求
    @RequestMapping("/")
    public String handler01() {
        return "Hello,spring boot";
    }
}
