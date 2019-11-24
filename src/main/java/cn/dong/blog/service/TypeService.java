package cn.dong.blog.service;

import cn.dong.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author : Dong
 * @date : 2019/11/24 13:24
 */
public interface TypeService {

    Type saveType(Type type);

    Type getType(Long id);

    Type getTypeByName(String name);

    Page<Type> listType(Pageable pageable);

    void deleteType(Long id);
}
