package com.yuri.servletPro.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-30 14:07
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class ServletConfigServlet extends HttpServlet {


    /**
     * servletConfig对象
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //获取ServletConfig对象
        ServletConfig servletConfig = this.getServletConfig();

        //获取web.xml中的配置数据
        String config = servletConfig.getInitParameter("config");
        System.out.println(config);

    }
}
