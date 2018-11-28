package com.yuri.servletPro.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-28 11:03
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class CookieServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        //处理请求
        //响应处理结果

        //使用Cookie进行浏览器端的数据存储
        //创建Cookie对象
        Cookie ck = new Cookie("uname", "jsd");
        Cookie ck2 = new Cookie("pwd", "jsd001");
        //设置Cookie
        //设置Cookie的有效期
        //ck2.setMaxAge(3600 * 24 * 3);
        //设置有效路径
        ck.setPath("/getCk");
        ck2.setPath("/getCk");

        //响应Cookie信息
        resp.addCookie(ck);
        resp.addCookie(ck2);

        //直接响应
        //请求转发
        //重定向

    }
}
