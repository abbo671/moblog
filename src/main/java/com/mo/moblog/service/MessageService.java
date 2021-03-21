package com.mo.moblog.service;

import com.mo.moblog.pojo.Message;

import java.util.List;

/**
 * @InterfaceName MessageService
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 11:20
 **/
public interface MessageService {
    //查询留言列表
    List<Message> listMessage();

    //保存留言
    int saveMessage(Message message);

    //删除留言
    void deleteMessage(Long id);
}
