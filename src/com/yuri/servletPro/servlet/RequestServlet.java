package com.yuri.servletPro.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * @author yurifeng
 * @create 2018-11-26 18:48
 * @packageName ${PACKAGE_NAME}
 * @projectName servletPro004
 **/
public class RequestServlet extends HttpServlet {

    /**
     * Get方法
     *
     * @param req
     * @param resp
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doGet....");
    }

    /**
     * Post方法
     *
     * @param req
     * @param resp
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("doPost...");
    }

    /**
     * Service方法
     *
     * @param req httpservlet的请求
     * @param resp httpservlet的响应
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {

        //int i = 5 / 0;
        //System.out.println("我是service....");
        //super.service(req, resp);

        /**
         * 获取请求方式
         */
        String method = req.getMethod();
        //System.out.println(method);

        StringBuffer requestURL = req.getRequestURL();
        //System.out.println(requestURL);//"http://localhost:8888/yes"

        String requestURI = req.getRequestURI();
        //System.out.println(requestURI);//"/yes"

        /**
         * 获取请求协议
         */
        String scheme = req.getScheme();
        //System.out.println(scheme);//"http"


        /**
         * 获取请求行数据
         */
        String header = req.getHeader("User-Agent");
        //System.out.println(header);

        /**
         * 获取所有请求行的枚举
         */
        Enumeration<String> headerNames = req.getHeaderNames();//获取key
        //遍历Enumeration的输出
        while (headerNames.hasMoreElements()) {
            String name = headerNames.nextElement();
            //System.out.println("item:" + headerNames.nextElement());
            String value = req.getHeader(name);//获取value

            System.out.println(name + ": " + value);
        }


        /**
         * 获取用户数据
         */
        String uname = req.getParameter("uname");
        String pwd = req.getParameter("pwd");
        String favorite = req.getParameter("favorite");//getParameter不能处理同键不同值的多项情况
        System.out.println("username: " + uname);
        System.out.println("password: " + pwd);
        //System.out.println("favorite: " + favorite);

        if (req.getParameterValues("favorite") != null) {//判断req.getParameterValues()不为空,否则会出现空指针异常
            String[] favorites = req.getParameterValues("favorite");
            for (String str : favorites) {
                System.out.println("favorite: " + str);
            }
        }


        System.out.println();


        //获取所有用户请求数据的枚举集合
        Enumeration<String> parameterNames = req.getParameterNames();
        while (parameterNames.hasMoreElements()) {
            String element = parameterNames.nextElement();
            System.out.println(element);
        }


    }
}
