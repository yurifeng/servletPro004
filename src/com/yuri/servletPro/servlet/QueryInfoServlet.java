package com.yuri.servletPro.servlet;

import com.yuri.servletPro.bean.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-28 22:17
 * @packageName ${PACKAGE_NAME}
 * @projectName servletPro004
 **/
public class QueryInfoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        HttpSession session = req.getSession();

        //判断session里面是否有user
        if (session.getAttribute("user") != null) {
            User user = (User) session.getAttribute("user");
            //处理请求
            //响应处理结果
            resp.getWriter().write("<html>");
            resp.getWriter().write("<head>");
            resp.getWriter().write("<body>");
            resp.getWriter().write("<h3>Welcome to MainPage," + user.getUname() + "</h3>");//req中存有请求参数
            resp.getWriter().write("<hr/>");
            resp.getWriter().write("<p>编号: " + user.getUid() + "</p>");
            resp.getWriter().write("<p>姓名: " + user.getUname() + "</p>");
            resp.getWriter().write("<p>密码: " + user.getPwd() + "</p>");
            resp.getWriter().write("<form action='page' method='post'>");
            resp.getWriter().write("<input type='submit' value='返回上一级'>");
            //resp.getWriter().write("<input type='submit' value='退出'>");
            resp.getWriter().write("</body>");
            resp.getWriter().write("</head>");
            resp.getWriter().write("</html>");
        } else {
            //session中没有user(包括过期和用户自主退出),就重定向至登陆页面
            resp.sendRedirect("/checkCk");
            return;
        }

    }
}
