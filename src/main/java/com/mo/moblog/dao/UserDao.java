package com.mo.moblog.dao;


import com.mo.moblog.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @InterfaceName UserDao
 * @Description TODO
 * @Author mo
 * @Date 2021/3/15 20:47
 **/
@Mapper
@Repository
public interface UserDao {
    User getuserbyusernameandpassword(String username, String password);

}
