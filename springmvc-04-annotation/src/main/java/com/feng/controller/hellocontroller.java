package com.feng.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  hellocontroller {

    @RequestMapping("/he")
    public String hello(Model model){
        //
        model.addAttribute("msg","hello springmvcanntation");

        return "jss";//会被视图解析器处理
    }
}
