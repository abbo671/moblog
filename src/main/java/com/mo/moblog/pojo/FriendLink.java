package com.mo.moblog.pojo;

import java.util.Date;

/**
 * @ClassName FriendLink
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 10:47
 **/
public class FriendLink {
    private Long id;
    private String blogname;
    private String blogaddress;
    private String pictureaddress;
    private Date createTime;

    public FriendLink() {
    }

    public FriendLink(Long id, String blogname, String blogaddress, String pictureaddress, Date createTime) {
        this.id = id;
        this.blogname = blogname;
        this.blogaddress = blogaddress;
        this.pictureaddress = pictureaddress;
        this.createTime = createTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBlogname() {
        return blogname;
    }

    public void setBlogname(String blogname) {
        this.blogname = blogname;
    }

    public String getBlogaddress() {
        return blogaddress;
    }

    public void setBlogaddress(String blogaddress) {
        this.blogaddress = blogaddress;
    }

    public String getPictureaddress() {
        return pictureaddress;
    }

    public void setPictureaddress(String pictureaddress) {
        this.pictureaddress = pictureaddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FriendLink{" +
                "id=" + id +
                ", blogname='" + blogname + '\'' +
                ", blogaddress='" + blogaddress + '\'' +
                ", pictureaddress='" + pictureaddress + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
