package com.yuri.servletPro.servlet;

import javax.servlet.http.HttpServlet;
import java.io.*;

/**
 * @author yurifeng
 * @create 2018-11-29 13:40
 * @PACKAGE_NAME ${PACKAGE_NAME}
 * @PROJECT_NAME servletPro004
 */
public class InitialServlet extends HttpServlet {


    /**
     * 重写init方法
     * 将文件中的计数器读取到servletContext中
     */
    @Override
    public void init() {
        //获取文件中的计数器对象
        //获取文件路径
        String path = this.getServletContext().getRealPath("res/count.txt");
        //声明流对象
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String counts = br.readLine();
            System.out.println(counts);
            this.getServletContext().setAttribute("count", counts);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /**
     * 重写destroy方法
     * tomcat服务器关闭时,将计数器通过IO流写入文件
     */
    @Override
    public void destroy() {

        //获取网页计数器
        int counts = (int) this.getServletContext().getAttribute("count");

        //获取文件路径
        String path = this.getServletContext().getRealPath("res/count.txt");
        //声明BufferedWriter
        BufferedWriter bw = null;
        FileWriter fw = null;
        //System.out.println(path);

        try {
            fw = new FileWriter(path);
            bw = new BufferedWriter(fw);
            bw.write(counts);
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
