package com.mo.moblog.dao;

import com.mo.moblog.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @InterfaceName TypeDao
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 10:51
 **/
@Mapper
@Repository
public interface TypeDao {
    int saveType(Type type);

    Type getTypeById(Long id);

    List<Type> getAllType();

    List<Type> getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);
}
