package com.yuri.servletPro.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-26 22:44
 * @packageName ${PACKAGE_NAME}
 * @projectName servletPro004
 **/
public class HomeServlet extends HttpServlet {

    /**
     * 显示登陆页面
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应编码格式
        resp.setContentType("text/html;charset=UTF-8");
        //获取请求信息
        //处理请求
        //响应处理结果
        //获取request作用域
        String str = req.getAttribute("str") == null ? "" : (String) req.getAttribute("str");//三目运算
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<font color='red' size='5px'>" + str + "</font>");
        resp.getWriter().write("<form action='login' method='post'>");
        resp.getWriter().write("username:<input type='text' name='uname' value=''/><br/>");
        resp.getWriter().write("password:<input type='password' name='pwd' value=''/><br/>");
        resp.getWriter().write("<input type='submit' value='LOGIN BUTTON'/><br/>");
        resp.getWriter().write("</form>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</html>");

    }
}
