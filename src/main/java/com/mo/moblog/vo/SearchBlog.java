package com.mo.moblog.vo;

/**
 * @ClassName SearchBlog
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:50
 **/
public class SearchBlog {
    private String title;
    private Long typeId;

    public SearchBlog(String title, Long typeId) {
        this.title = title;
        this.typeId = typeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    @Override
    public String toString() {
        return "SearchBlog{" +
                "title='" + title + '\'' +
                ", typeId=" + typeId +
                '}';
    }
}
