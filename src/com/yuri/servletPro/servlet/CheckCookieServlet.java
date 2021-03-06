package com.yuri.servletPro.servlet;

import com.yuri.servletPro.bean.User;
import com.yuri.servletPro.service.LoginService;
import com.yuri.servletPro.serviceimpl.LoginServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-28 14:03
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class CheckCookieServlet extends HttpServlet {

    /**
     * Cookie 信息的校验:
     * ①校验正确,显示主页
     * ②校验失败,显示登陆页面
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

        //获取Cookie信息
        Cookie[] cookies = req.getCookies();

        //处理请求
        /**
         *检查Cookie,如果没有,显示登陆页面;
         */
        if (cookies != null) {
            //遍历Cookie信息
            String uid = "";
            for (Cookie cookie : cookies) {
                if ("uid".equals(cookie.getName())) {
                    uid = cookie.getValue();
                    //System.out.println(uid);
                }
            }
            //校验UID是否存在
            if ("".equals(uid)) {
                req.getRequestDispatcher("/home").forward(req, resp);
                return;
            } else {
                //校验UID用户信息
                //获取业务层对象
                LoginService ls = new LoginServiceImpl();
                User user = ls.checkUIDService(uid);
                if (user != null) {
                    //将用户数据存储到session中
                    req.getSession().setAttribute("user", user);

                    /**
                     * 在checkCl网页登陆时,记录浏览网页次数
                     */
                    //获取计数器
                    ServletContext servletContext = this.getServletContext();
                    int count;
                    if (servletContext.getAttribute("count") != null) {
                        count = (int) servletContext.getAttribute("count");
                        //递增
                        count += 1;
                        //存储计数器
                        servletContext.setAttribute("count", count);
                    } else {
                        servletContext.setAttribute("count", 1);
                    }

                    //如果用户存在
                    //重定向
                    resp.sendRedirect("/page");
                } else {
                    req.getRequestDispatcher("/home").forward(req, resp);
                    return;
                }
            }
        } else {
            //响应处理结果
            //请求转发
            req.getRequestDispatcher("/home").forward(req, resp);
            return;
        }

    }
}
