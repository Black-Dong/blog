package cn.dong.blog.service;

import cn.dong.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 分类的service
 * @author : Dong
 * @date : 2019/11/24 13:24
 */
public interface TypeService {

    /**
     * 保存分类
     * @param type
     * @return
     */
    Type saveType(Type type);

    /**
     * 根据id获取一个分类
     * @param id
     * @return
     */
    Type getType(Long id);

    /**
     * 根据name获取一个分类
     *      分类在新增和修改保存时都判断过是否为空和是否已拥有，具体在TypeController
     * @param name
     * @return
     */
    Type getTypeByName(String name);

    /**
     * 获取分类列表，使用SpringDataJpa自带Page与Pageable
     * @param pageable
     * @return
     */
    Page<Type> listType(Pageable pageable);

    /**
     * 查询所有分类
     * @return
     */
    List<Type> listType();

    /**
     * 删除分类
     * @param id
     */
    void deleteType(Long id);
}
