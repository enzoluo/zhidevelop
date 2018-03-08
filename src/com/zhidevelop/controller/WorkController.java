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

    @RequestMapping(value = "work")
    public String work(HttpServletRequest request) {
        HttpSession session = request.getSession();
        System.out.println(Msg.USERNAME);
        Object obj = session.getAttribute(Msg.USERNAME);
        int status;
        if (obj != null) {
            status = (int) session.getAttribute(Msg.USERNAME);
            if (status == 1) {
                return "portal/workportal";
            } else {
                return "login";
            }
        } else {
            return "login";
        }
    }
}
