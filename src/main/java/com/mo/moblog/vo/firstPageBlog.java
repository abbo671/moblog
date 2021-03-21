package com.mo.moblog.vo;

import java.util.Date;

/**
 * @ClassName firstPageBlog
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:48
 **/
public class firstPageBlog {
    private Long id;
    private String title;
    private String headerPicture;
    private Integer viewCount;
    private Integer commentCount;
    private Date updateTime;
    private String description;
    private String typeName;
    private String nickname;
    private String profile;

    public firstPageBlog(Long id, String title, String headerPicture, Integer viewCount, Integer commentCount, Date updateTime, String description, String typeName, String nickname, String profile) {
        this.id = id;
        this.title = title;
        this.headerPicture = headerPicture;
        this.viewCount = viewCount;
        this.commentCount = commentCount;
        this.updateTime = updateTime;
        this.description = description;
        this.typeName = typeName;
        this.nickname = nickname;
        this.profile = profile;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getHeaderPicture() {
        return headerPicture;
    }

    public void setHeaderPicture(String headerPicture) {
        this.headerPicture = headerPicture;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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

    @Override
    public String toString() {
        return "firstPageBlog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", headerPicture='" + headerPicture + '\'' +
                ", viewCount=" + viewCount +
                ", commentCount=" + commentCount +
                ", updateTime=" + updateTime +
                ", description='" + description + '\'' +
                ", typeName='" + typeName + '\'' +
                ", nickname='" + nickname + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
