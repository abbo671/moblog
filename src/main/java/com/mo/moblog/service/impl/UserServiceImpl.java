package com.mo.moblog.service.impl;

import com.mo.moblog.dao.UserDao;

import com.mo.moblog.pojo.User;
import com.mo.moblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author mo
 * @Date 2021/3/15 20:45
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userdao;

    @Override
    public User checkuser(String username, String password) {
        User user = userdao.getuserbyusernameandpassword(username, password);
        return user;
    }
}
