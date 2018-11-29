package com.yuri.servletPro.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/**
 * @author yurifeng
 * @create 2018-11-29 10:06
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class GetServletContextServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        resp.setContentType("text/html;charset=utf-8");

        /*//获取请求信息
        ServletContext ss = req.getSession().getServletContext();

        String string = (String) ss.getAttribute("string");
        System.out.println(string);

        //获取项目web.xml的全局配置数据
        String name = ss.getInitParameter("name");
        System.out.println(name);

        //获取枚举类型的全局initParameterNames的键和值
        Enumeration<String> initParameterNames = ss.getInitParameterNames();
        String name2;
        while (initParameterNames.hasMoreElements()) {
            name2 = initParameterNames.nextElement();
            System.out.println(name2 + "-->" + ss.getInitParameter(name2));
        }*/

        /*//获取项目目录下的资源路径
        String path = ss.getRealPath("/resource/project.txt");
        //System.out.println(path);*/

        /*//获取项目目录下的资源流对象
        InputStream resourceStream = ss.getResourceAsStream("/resource/project.txt");
        System.out.println(resourceStream);*/


    }
}
