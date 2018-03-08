package com.zhidevelop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * description
 * author enzoluo
 * time 2017-11-24 10:44
 * version v1.0
 **/
@Controller
public class PageController {
//    @RequestMapping(value = "login")
//    public String testPage(HttpServletRequest request, @RequestParam(value = "userName", required = true) String userName, @RequestParam(value = "password", required = true) String password) {
//        if (userName.equals("enzoluo") && password.equals("123")) {
//            request.getSession().setAttribute("userName", "userName");
//            return "portal/workportal";
//        } else {
//            return "login";
//        }
//    }

    @RequestMapping(value = "msg")
    public String msg() {
        return "message";
    }

    @RequestMapping(value = "loginPage")
    public String loginPage() {
        return "login";
    }

    @RequestMapping(value = "main.do")
    public String main() {
        return "sys/sys-main";
    }

    @RequestMapping(value = "sys")
    public String sys() {
        return "sys/index";
    }




}
