package com.mo.moblog.vo;

import java.util.Date;

/**
 * @ClassName DetailedBlog
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:45
 **/
public class DetailedBlog {
    private Long id;
    private String headerPicture;
    private String flag;
    private String title;
    private String content;
    private Integer viewCount;
    private Integer commentCount;
    private Date updateTime;
    private String nickname;
    private String profile;
    private String Typename;

    public DetailedBlog(Long id, String headerPicture, String flag, String title, String content, Integer viewCount, Integer commentCount, Date updateTime, String nickname, String profile, String typename) {
        this.id = id;
        this.headerPicture = headerPicture;
        this.flag = flag;
        this.title = title;
        this.content = content;
        this.viewCount = viewCount;
        this.commentCount = commentCount;
        this.updateTime = updateTime;
        this.nickname = nickname;
        this.profile = profile;
        Typename = typename;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHeaderPicture() {
        return headerPicture;
    }

    public void setHeaderPicture(String headerPicture) {
        this.headerPicture = headerPicture;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getTypename() {
        return Typename;
    }

    public void setTypename(String typename) {
        Typename = typename;
    }

    @Override
    public String toString() {
        return "DetailedBlog{" +
                "id=" + id +
                ", headerPicture='" + headerPicture + '\'' +
                ", flag='" + flag + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", viewCount=" + viewCount +
                ", commentCount=" + commentCount +
                ", updateTime=" + updateTime +
                ", nickname='" + nickname + '\'' +
                ", profile='" + profile + '\'' +
                ", Typename='" + Typename + '\'' +
                '}';
    }
}
