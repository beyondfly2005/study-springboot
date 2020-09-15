package com.beyonsoft.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class TestController {

    /*String 类型的返回值， 默认会找模板文件 templates  list.html
     *
     * */
    @RequestMapping("/list")
//    @ResponseBody
    public String list() {
        return "list";
    }

    //跳转到jsp页面
    @RequestMapping("/list1")
    public String list1() {
        return "list1";
    }

    @RequestMapping("/mod")
    @ResponseBody
    public ModelAndView mod() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }
}
