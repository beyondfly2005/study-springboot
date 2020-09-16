package com.beyondsoft.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 */
@Controller
public class TestController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloPage() {
        return "hello ";
    }

    @RequestMapping("/login")
    @ResponseBody
    public String login() {
        return "login ... ";
    }

    @RequestMapping("/index")
    @ResponseBody
    public String index() {
        return "index ...";
    }
}
