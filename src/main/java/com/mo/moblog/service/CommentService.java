package com.mo.moblog.service;

import com.mo.moblog.pojo.Comment;

import java.util.List;

/**
 * @InterfaceName CommentService
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 21:54
 **/
public interface CommentService {
    List<Comment> listCommentByBlogId(Long blogId);

    int saveComment(Comment comment);

//    查询子评论
//    List<Comment> getChildComment(Long blogId,Long id);

    //删除评论
    void deleteComment(Comment comment,Long id);
}
