package com.mo.moblog.service;

import com.mo.moblog.pojo.Picture;

import java.util.List;

/**
 * @InterfaceName PictureService
 * @Description TODO
 * @Author mo
 * @Date 2021/3/17 11:13
 **/
public interface PictureService {
    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Long id);

    //    编辑修改相册
    int updatePicture(Picture picture);

    //    删除照片
    void deletePicture(Long id);
    
}
