package com.mo.moblog.dao;

import com.mo.moblog.pojo.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName FriendLinkDao
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 10:49
 **/
@Mapper
@Repository
public interface FriendLinkDao {
    List<FriendLink> listFriendLink();

    int saveFriendLink(FriendLink friendLink);

    FriendLink getFriendLink(Long id);

    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    int updateFriendLink(FriendLink friendLink);

    void deleteFriendLink(Long id);
}
