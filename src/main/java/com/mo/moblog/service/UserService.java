package com.mo.moblog.service;


import com.mo.moblog.pojo.User;

/**
 * @InterfaceName UserService
 * @Description TODO
 * @Author mo
 * @Date 2021/3/15 20:40
 **/
public interface UserService {
    User checkuser(String username, String password);
}
