package com.mo.moblog.service;

import com.mo.moblog.pojo.Blog;
import com.mo.moblog.vo.*;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @InterfaceName BlogService
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 20:28
 **/
@Service
public interface BlogService {
    ShowBlog getBlogById(Long id);

    List<QueryBlog> getAllBlog();

    int saveBlog(Blog blog);

    int updateBlog(ShowBlog showBlog);

    void deleteBlog(Long id);

    List<QueryBlog> getBlogBySearch(SearchBlog searchBlog);

    List<firstPageBlog> getAllFirstPageBlog();

    List<RecommendBlog> getRecommendedBlog();

    //List<firstPageBlog> getNewBlog();

    List<firstPageBlog> getSearchBlog(String query);

    DetailedBlog getDetailedBlog(Long id) throws NotFoundException;

    List<firstPageBlog> getByTypeId(Long typeId);

    Integer getBlogTotal();

    Integer getBlogViewTotal();

    Integer getBlogCommentTotal();

    Integer getBlogMessageTotal();
}
