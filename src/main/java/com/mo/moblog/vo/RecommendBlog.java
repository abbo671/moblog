package com.mo.moblog.vo;

/**
 * @ClassName RecommendBlog
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:37
 **/
public class RecommendBlog {
    private Long id;
    private String title;
    private String headerPicture;
    private boolean isRecommend;

    public RecommendBlog(Long id, String title, String headerPicture, boolean isRecommend) {
        this.id = id;
        this.title = title;
        this.headerPicture = headerPicture;
        this.isRecommend = isRecommend;
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

    public boolean isRecommend() {
        return isRecommend;
    }

    public void setRecommend(boolean recommend) {
        isRecommend = recommend;
    }

    @Override
    public String toString() {
        return "RecommendBlog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", headerPicture='" + headerPicture + '\'' +
                ", isRecommend=" + isRecommend +
                '}';
    }
}
