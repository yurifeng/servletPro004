package com.yuri.servletPro.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-29 9:51
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class ServletContextServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取ServletContext对象
        //方式一:
        ServletContext sc = this.getServletContext();
        //方式二:
        ServletContext sc2 = this.getServletConfig().getServletContext();
        //方式三:
        ServletContext sc3 = req.getSession().getServletContext();
        /*System.out.println(sc == sc2);
        System.out.println(sc == sc3);
        System.out.println(sc2 == sc3);*/

        //使用ServletContext对象完成数据共享
        sc3.setAttribute("string", "0xfffffffff");

       /* //获取项目web.xml的全局配置数据
        String name = sc3.getInitParameter("name");
        System.out.println(name);*/




    }
}
