package com.yuri.servletPro.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-26 23:00
 * @packageName ${PACKAGE_NAME}
 * @projectName servletPro004
 **/
public class LoginServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");

        //System.out.println(uname + " : " + pwd);

        if (uname != null || pwd != null) {

        }
        //处理请求信息
        //响应处理请求结果
    }
}
