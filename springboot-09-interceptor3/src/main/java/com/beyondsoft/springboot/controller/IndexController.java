package com.beyondsoft.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Copyright: Copyright (c) 2020 Anchuang Network Technology Co., Ltd
 *
 * @ClassName: com.ac.intellsecurity.controller.TestController
 * @Description: 该类的功能描述
 * @version: v1.0.0
 * @author: gaolongfei
 * @date: 2020/9/2 10:10
 * <p>
 */
@Controller
public class IndexController {

    private static  final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/jsp")
    public String indexJsp(HttpServletRequest request) {
        request.setAttribute("bs", "我是jsp");
        LOGGER.info("==========jsp==========");
        return "jsp/success.jsp";
    }

    @RequestMapping("/jsp1")
    public String indexJsp1(HttpServletRequest request) {
        request.setAttribute("bs", "我是jsp");
        LOGGER.info("==========jsp==========");
        return "jsp/index.jsp";
    }

    @RequestMapping("/free")
    public String indexFree(HttpServletRequest request) {
        request.setAttribute("bs", "我是freemarker");
        LOGGER.info("==========free==========");
        return "jsp/index";
    }

//    @RequestMapping("/login")
//    //@ResponseBody
//    public String login(HttpServletRequest request) {
//        request.setAttribute("bs", "我是login");
//        LOGGER.info("==========login==========");
//        return "jsp/index";
//    }

//    @RequestMapping("/")
//    public String index(){
//        return "/page/login";
//    }

//    @RequestMapping("/index")
//    public String toIndex(){
//        return "/page/login";
//    }

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
