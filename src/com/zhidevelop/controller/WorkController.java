package com.zhidevelop.controller;


import com.zhidevelop.util.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * description
 * author enzoluo
 * time 2018-03-07 17:48
 * version v1.0
 **/
@Controller
public class WorkController {

    @RequestMapping(value = "work.do")
    public String work(HttpServletRequest request) {

        return "portal/workportal";

    }
    @RequestMapping("logout")
    public String Logout(HttpServletRequest request){
        request.getSession().invalidate();
        return "login";
    }
}
