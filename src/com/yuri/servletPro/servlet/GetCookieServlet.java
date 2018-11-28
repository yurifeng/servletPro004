package com.yuri.servletPro.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-28 13:15
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class GetCookieServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //获取Cookie信息
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();//获取key
                String pwd = cookie.getValue();//获取value
                System.out.println(name + ":" + pwd);
            }
        }
        //获取用户数据
        //处理请求
        //响应处理结果
    }
}
