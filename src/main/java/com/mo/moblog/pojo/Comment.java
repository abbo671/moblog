package com.mo.moblog.pojo;

import com.mo.moblog.vo.DetailedBlog;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Comment
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 9:56
 **/
public class Comment {
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String profile;
    private Date createTime;
    private Long blogId;
    private Long parentCommentId;
    private String parentNickname;
    private List<Comment> replyComments = new ArrayList<>();
    private Comment parentComment;
    private boolean adminComment;
    private DetailedBlog blog;

    public Comment(Long id, String nickname, String email, String content, String profile, Date createTime, Long blogId, Long parentCommentId, String parentNickname, List<Comment> replyComments, Comment parentComment, boolean adminComment, DetailedBlog blog) {
        this.id = id;
        this.nickname = nickname;
        this.email = email;
        this.content = content;
        this.profile = profile;
        this.createTime = createTime;
        this.blogId = blogId;
        this.parentCommentId = parentCommentId;
        this.parentNickname = parentNickname;
        this.replyComments = replyComments;
        this.parentComment = parentComment;
        this.adminComment = adminComment;
        this.blog = blog;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getBlogId() {
        return blogId;
    }

    public void setBlogId(Long blogId) {
        this.blogId = blogId;
    }

    public Long getParentCommentId() {
        return parentCommentId;
    }

    public void setParentCommentId(Long parentCommentId) {
        this.parentCommentId = parentCommentId;
    }

    public String getParentNickname() {
        return parentNickname;
    }

    public void setParentNickname(String parentNickname) {
        this.parentNickname = parentNickname;
    }

    public List<Comment> getReplyComments() {
        return replyComments;
    }

    public void setReplyComments(List<Comment> replyComments) {
        this.replyComments = replyComments;
    }

    public Comment getParentComment() {
        return parentComment;
    }

    public void setParentComment(Comment parentComment) {
        this.parentComment = parentComment;
    }

    public boolean isAdminComment() {
        return adminComment;
    }

    public void setAdminComment(boolean adminComment) {
        this.adminComment = adminComment;
    }

    public DetailedBlog getBlog() {
        return blog;
    }

    public void setBlog(DetailedBlog blog) {
        this.blog = blog;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", email='" + email + '\'' +
                ", content='" + content + '\'' +
                ", profile='" + profile + '\'' +
                ", createTime=" + createTime +
                ", blogId=" + blogId +
                ", parentCommentId=" + parentCommentId +
                ", parentNickname='" + parentNickname + '\'' +
                ", replyComments=" + replyComments +
                ", parentComment=" + parentComment +
                ", adminComment=" + adminComment +
                ", blog=" + blog +
                '}';
    }
}
