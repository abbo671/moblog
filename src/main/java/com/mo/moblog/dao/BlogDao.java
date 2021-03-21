package com.mo.moblog.dao;

import com.mo.moblog.pojo.Blog;
import com.mo.moblog.vo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName BlogDao
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 21:18
 **/
@Mapper
@Repository
public interface BlogDao {
    ShowBlog getBlogById(Long id);

    List<Blog> getAllBlog();

    List<QueryBlog> getAllBlogQuery();

    int saveBlog(Blog blog);

    int updateBlog(ShowBlog showBlog);

    void deleteBlog(Long id);

    List<QueryBlog> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog);

    List<firstPageBlog> getFirstPageBlog();

    List<RecommendBlog> getAllRecommendBlog();

//    List<FirstPageBlog> getNewBlog();

    List<firstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id);

    int updateViews(Long id);

    //    根据博客id查询出评论数量
    int getCommentCountById(Long id);

    List<firstPageBlog> getByTypeId(Long typeId);

    Integer getBlogTotal();

    Integer getBlogViewTotal();

    Integer getBlogCommentTotal();

    Integer getBlogMessageTotal();
}

