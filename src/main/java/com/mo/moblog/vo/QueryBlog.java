package com.mo.moblog.vo;

import com.mo.moblog.pojo.Type;

import java.util.Date;

/**
 * @ClassName QueryBlog
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:41
 **/
public class QueryBlog {
    private Long id;
    private String title;
    private Date updateTime;
    private Boolean isRecommend;
    private Boolean isPublished;
    private Long typeId;
    private Type type;

    public QueryBlog() {
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getRecommend() {
        return isRecommend;
    }

    public void setRecommend(Boolean recommend) {
        this.isRecommend = recommend;
    }

    public Boolean getPublished() {
        return isPublished;
    }

    public void setPublished(Boolean published) {
        this.isPublished = published;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "BlogQuery{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", updateTime=" + updateTime +
                ", recommend=" + isRecommend +
                ", published=" + isPublished +
                ", typeId=" + typeId +
                ", type=" + type +
                '}';
    }
}
