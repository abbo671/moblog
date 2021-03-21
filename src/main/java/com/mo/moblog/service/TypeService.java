package com.mo.moblog.service;

import com.github.pagehelper.Page;
import com.mo.moblog.pojo.Type;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @InterfaceName TypeService
 * @Description TODO
 * @Author mo
 * @Date 2021/3/16 10:26
 **/
@Service
public interface TypeService {
    int saveType(Type type);

    Type getTypeById(Long id);

    List<Type> getAllType();

    List<Type> getAllTypeAndBlog();

    Type getTypeByName(String name);

    int updateType(Type type);

    void deleteType(Long id);
}
