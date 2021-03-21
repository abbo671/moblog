package com.mo.moblog.dao;

import com.mo.moblog.pojo.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName PictureDao
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 11:17
 **/
@Mapper
@Repository
public interface PictureDao {
    List<Picture> listPicture();

    int savePicture(Picture picture);

    Picture getPicture(Long id);

    int updatePicture(Picture picture);

    void deletePicture(Long id);

}

