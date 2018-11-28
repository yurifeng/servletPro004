package com.yuri.servletPro.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-28 9:29
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class MainServlet extends HttpServlet {

    /**
     * 登陆成功后的主页
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //处理请求
        //响应处理结果
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<h3>Welcome to MainPage," + "</h3>");//req中存有请求参数
        resp.getWriter().write("<hr/>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("</html>");
    }
}
