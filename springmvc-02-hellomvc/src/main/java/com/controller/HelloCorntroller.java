package com.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注意：这里我们先实现Controller接口！
public class HelloCorntroller implements Controller {

    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        //ModelAndView：模型和视图
        ModelAndView modelAndView = new ModelAndView();

        //封装对象，放在modelAndView中
        modelAndView.addObject("msg","Spring MVC  Hello!");

        //封装要跳转的视图，放到ModelAndView中
        modelAndView.setViewName("hello");

        return modelAndView;

    }
}
