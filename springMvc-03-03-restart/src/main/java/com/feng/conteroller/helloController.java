package com.feng.conteroller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class helloController implements Controller {
    public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
        ModelAndView mv = new ModelAndView();
        //业务代码，
        String result = "hellospringMvc";
        mv.addObject("msg",result);
        //试图跳转
        mv.setViewName("test.jsp");

        return null;
    }
}
