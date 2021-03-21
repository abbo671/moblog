package com.mo.moblog.vo;

import java.util.Date;

/**
 * @ClassName ShowBlog
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:51
 **/
public class ShowBlog {
    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String headerPicture;
    private String description;
    private boolean isRecommend;
    private boolean isPublished;
    private Date updateTime;

    public ShowBlog(Long id, String flag, String title, String content, Long typeId, String headerPicture, String description, boolean isRecommend, boolean isPublished, Date updateTime) {
        this.id = id;
        this.flag = flag;
        this.title = title;
        this.content = content;
        this.typeId = typeId;
        this.headerPicture = headerPicture;
        this.description = description;
        this.isRecommend = isRecommend;
        this.isPublished = isPublished;
        this.updateTime = updateTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getHeaderPicture() {
        return headerPicture;
    }

    public void setHeaderPicture(String headerPicture) {
        this.headerPicture = headerPicture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isRecommend() {
        return isRecommend;
    }

    public void setRecommend(boolean recommend) {
        isRecommend = recommend;
    }

    public boolean isPublished() {
        return isPublished;
    }

    public void setPublished(boolean published) {
        isPublished = published;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ShowBlog{" +
                "id=" + id +
                ", flag='" + flag + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", typeId=" + typeId +
                ", headerPicture='" + headerPicture + '\'' +
                ", description='" + description + '\'' +
                ", isRecommend=" + isRecommend +
                ", isPublished=" + isPublished +
                ", updateTime=" + updateTime +
                '}';
    }
}
