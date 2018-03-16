package com.zhidevelop.controller;

import com.zhidevelop.entity.Person;
import com.zhidevelop.service.UserService;
import com.zhidevelop.util.Msg;
import com.zhidevelop.util.Result;
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
    /**
     * Method verify
     * Description 验证用户名、密码
     * @params HttpServletRequest、HttpServletResponse、loginName、password
     * @return
     * Date 2018-3-8 11:32
     * Author EnzoLuo
     */
    @RequestMapping("login")
    public void verify(HttpServletRequest request,HttpServletResponse response,@RequestParam(required = true,value = "loginName") String loginName, @RequestParam(required = true,value = "password") String password) throws Exception{
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        Result rs = new Result();
        if(userService.verify(loginName,password)){
            HttpSession session = request.getSession();
            session.setAttribute("user",loginName);
            rs.setMsg("success");
        }else {
            rs.setMsg("fail");
        }
        String str = JSONObject.fromObject(rs).toString();
        out.write(str);
        out.flush();
        out.close();
    }
    @RequestMapping("addUser")
    public void addUser(HttpServletResponse response,Person person) throws Exception{
        System.out.println(person.getName());
        boolean bool = userService.save(person);
        Result rs = new Result();
        if(bool){
            rs.setMsg("success");
        }else {
            rs.setMsg("fail");
        }
        response.setCharacterEncoding("utf-8");
        PrintWriter out = response.getWriter();
        String str = JSONObject.fromObject(rs).toString();
        out.write(str);
        out.flush();
        out.close();
    }
}
