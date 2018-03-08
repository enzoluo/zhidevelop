package com.zhidevelop.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * description
 * author enzoluo
 * time 2017-11-24 13:24
 * version v1.0
 **/
@WebFilter(filterName = "LoginFilter")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // set filter reseon
        HttpServletRequest request = (HttpServletRequest) req;
        if (request.getSession().getAttribute("userName") == null) {
            System.out.println("user not login");
            req.getRequestDispatcher("loginPage").forward(request, resp);
        } else {
            System.out.println("user already login");
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
