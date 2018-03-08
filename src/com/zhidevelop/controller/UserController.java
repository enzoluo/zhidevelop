package com.zhidevelop.controller;

import com.zhidevelop.service.UserService;
import com.zhidevelop.util.Msg;
import com.zhidevelop.util.Result;
import net.sf.json.JSON;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * description
 * author enzoluo
 * time 2017-11-24 15:43
 * version v1.0
 **/
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("login")
    public void verify(HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true,value = "loginName") String loginName, @RequestParam(required = true,value = "password") String password) throws Exception{
        response.setCharacterEncoding("utf-8");
        System.out.println("into");
        PrintWriter out = response.getWriter();
        Result rs = new Result();
        if(userService.verify(loginName,password)){
            Msg.USERNAME = loginName;
            HttpSession session = request.getSession();
            Msg.LOGINED_STATUS = 1;
            session.setAttribute(loginName,Msg.LOGINED_STATUS);
            rs.setMsg("success");
        }else {
            rs.setMsg("fail");
        }
        String str = JSONObject.fromObject(rs).toString();
        out.write(str);
        out.flush();
        out.close();
    }
}
