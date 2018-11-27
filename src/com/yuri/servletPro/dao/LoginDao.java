package com.yuri.servletPro.dao;

import com.yuri.servletPro.bean.User;

import java.sql.SQLException;

/**
 * @author yurifeng
 * @create 2018-11-27 10:26
 * @PACKAGE_NAME com.yuri.servletPro.dao
 * @PROJECT_NAME servletPro004
 */
public interface LoginDao {

    User checkLoginDao(String uname, String pwd) throws SQLException;
}
