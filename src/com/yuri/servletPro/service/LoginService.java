package com.yuri.servletPro.service;

import com.yuri.servletPro.bean.User;

import java.sql.SQLException;

/**
 * @author yurifeng
 * @create 2018-11-27 10:08
 * @PACKAGE_NAME com.yuri.servletPro.service
 * @PROJECT_NAME servletPro004
 */
public interface LoginService {

    /**
     * 验证用户信息
     *
     * @param uname
     * @param pwd
     * @return
     */
    User checkLoginService(String uname, String pwd) throws SQLException;


    /**
     * 检验UID信息
     *
     * @param uid
     * @return
     */
    User checkUIDService(String uid);
}
