package com.yuri.servletPro.servlet;

import com.yuri.servletPro.bean.User;
import com.yuri.servletPro.service.LoginService;
import com.yuri.servletPro.serviceimpl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author yurifeng
 * @create 2018-11-26 23:00
 * @packageName ${PACKAGE_NAME}
 * @projectName servletPro004
 **/
public class LoginServlet extends HttpServlet {

    /**
     * 登陆操作的内部逻辑
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");
        //获取请求信息
        String uname = req.getParameter("uname");
        uname = new String(uname.getBytes("ISO-8859-1"), "utf-8");//转换编码格式
        String pwd = req.getParameter("pwd");

        //System.out.println(uname + " : " + pwd);

        //在servlet中验证用户输入的信息是否匹配
        LoginService ls = new LoginServiceImpl();

        User user = null;
        try {
            user = ls.checkLoginService(uname, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
            //System.out.println("com.yuri.servletPro.servlet.LoginServlet 这里出现了错误....");
        }

        if (user != null) {

            //创建Cookie信息实现多天免登陆
            //Cookie存储的用户的uid
            Cookie ck = new Cookie("uid", user.getUid() + "");
            //设置Cookie的有效期
            ck.setMaxAge(3600 * 24 * 3);
            ck.setPath("/checkCk");
            HttpSession session = req.getSession();
            session.setAttribute("name", uname);
            resp.addCookie(ck);
            resp.sendRedirect("/page");//登陆成功,重定向到main(避免重复提交)
            return;
        } else {
            req.setAttribute("str", "用户名或密码错误");
            req.getRequestDispatcher("home").forward(req, resp);//登陆失败转发到home
            return;
        }

        //System.out.println(user);


        //处理请求信息
        //响应处理请求结果
    }
}
