package com.yuri.servletPro.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-26 20:28
 * @packageName ${PACKAGE_NAME}
 * @projectName servletPro004
 **/
public class ResponseServlet extends HttpServlet {

    /**
     * 重写父类service方法
     *
     * @param req  httpservlet的请求
     * @param resp httpservlet的响应
     * @throws IOException
     */
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        resp.setHeader("Mouse", "Microsoft");
        resp.setHeader("Mouse", "Acer");//setHeader()方法覆盖添加
        resp.addHeader("TouchPad", "Cisco");
        resp.addHeader("TouchPad", "Oracle");//addHeader()方法非覆盖添加

        //resp.sendError(404, "Sorry,File not found");//发送错误信息

        //设置响应编码格式
        //resp.setHeader("content-type", "text/html;charset=utf-8");
        resp.setContentType("text/html;charset=UTF-8");//html格式,编码是utf-8
        //resp.setContentType("text/plain;charset=UTF-8");//普通文本格式,编码是utf-8
        //resp.setContentType("text/xml;charset=UTF-8");//xml文件格式,编码是utf-8


        //设置响应实体
        resp.getWriter().write("<b>ut-8可以写中文..</b>");
    }
}
