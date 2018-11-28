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

    /**
     * 根据用户名和密码获取信息
     *
     * @param uname
     * @param pwd
     * @return
     * @throws SQLException
     */
    User checkLoginDao(String uname, String pwd) throws SQLException;

    /**
     * 根据Uid获取信息
     *
     * @param uid
     * @return
     */
    User checkUIDDao(String uid);
}
