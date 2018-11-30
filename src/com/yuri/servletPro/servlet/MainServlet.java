package com.yuri.servletPro.servlet;

import com.yuri.servletPro.bean.User;

import javax.servlet.ServletException;
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
        User user = (User) req.getSession().getAttribute("user");

        int count = 0;

        if (this.getServletContext().getAttribute("counts") != null) {

            count = (int) this.getServletContext().getAttribute("counts");
        }

        //处理请求
        //响应处理结果
        resp.getWriter().write("<html>");
        resp.getWriter().write("<head>");
        resp.getWriter().write("<body>");
        resp.getWriter().write("<h3>Welcome to MainPage," + user.getUname() + "</h3>");//req中存有请求参数
        resp.getWriter().write("<hr/>");
        resp.getWriter().write("<form action='cx' method='post'>");
        resp.getWriter().write("<input type='submit' value='查看个人信息'>");
        resp.getWriter().write("</form>");
        resp.getWriter().write("</body>");
        resp.getWriter().write("</head>");
        resp.getWriter().write("<p>网页共被浏览" + count + "次</p>");
        resp.getWriter().write("</html>");


    }
}
