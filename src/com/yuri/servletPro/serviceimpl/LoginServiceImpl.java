package com.yuri.servletPro.serviceimpl;

import com.yuri.servletPro.bean.User;
import com.yuri.servletPro.dao.LoginDao;
import com.yuri.servletPro.daoimpl.LoginDaoImpl;
import com.yuri.servletPro.service.LoginService;

import java.sql.SQLException;

/**
 * @author yurifeng
 * @create 2018-11-27 10:15
 * @PACKAGE_NAME com.yuri.servletPro.serviceimpl
 * @PROJECT_NAME servletPro004
 */
public class LoginServiceImpl implements LoginService {

    //创建Dao层对象
    LoginDao ld = new LoginDaoImpl();


    @Override
    public User checkLoginService(String uname, String pwd) throws SQLException {

        return ld.checkLoginDao(uname, pwd);
    }
}
