package com.yuri.servletPro.Session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author yurifeng
 * @create 2018-11-28 15:31
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class SessionServlet extends HttpServlet {

    /**
     * Session用于同一用户不同的请求使用同一个request对象的数据共享
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
        String name = "haha0x001";

        //处理请求信息
        //创建session对象(req中没有sessionid,则创建;如果有sessionid,则取出id)
        HttpSession session = req.getSession();
        //System.out.println(session.getId());

        //设置session的存储时间
        //session.setMaxInactiveInterval(5);

        //设置session强制失效
        //session.invalidate();

        //存储数据
        session.setAttribute("name", name);
        //响应处理结果
        //直接响应
        //请求转发
        //重定向

    }
}
