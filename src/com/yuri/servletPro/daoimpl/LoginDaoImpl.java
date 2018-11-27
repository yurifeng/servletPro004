package com.yuri.servletPro.daoimpl;

import com.yuri.servletPro.bean.User;
import com.yuri.servletPro.dao.LoginDao;

import java.sql.*;

/**
 * @author yurifeng
 * @create 2018-11-27 10:28
 * @PACKAGE_NAME com.yuri.servletPro.daoimpl
 * @PROJECT_NAME servletPro004
 */
public class LoginDaoImpl implements LoginDao {

    @Override
    public User checkLoginDao(String uname, String pwd) {

        //声明JDBC对象
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/jsp_servlet?serverTimezone=UTC";
        String username = "yty";
        String password = "ytyy";

        //声明数据存储对象
        User user = null;
        try {
            Class.forName(driver);
            //System.out.println("成功加载MySQL驱动！");
            conn = DriverManager.getConnection(url, username, password);
            String sql = "select * from t_user where uname=? and pwd=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, uname);
            ps.setString(2, pwd);
            rs = ps.executeQuery();
            while (rs.next()) {
                user = new User();
                user.setUid(rs.getInt("uid"));
                user.setUname(rs.getString("uname"));
                user.setPwd(rs.getString("pwd"));
            }
        } catch (ClassNotFoundException e) {
            System.out.println("找不到MySQL驱动!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return user;


    }
}