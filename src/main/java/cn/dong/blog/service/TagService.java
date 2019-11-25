package cn.dong.blog.service;

import cn.dong.blog.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 标签的Service
 * @author : Dong
 * @date : 2019/11/24 18:30
 */
public interface TagService {

    /**
     * 保存标签
     * @param type
     * @return
     */
    Tag saveTag(Tag type);

    /**
     * 根据id获取一个标签
     * @param id
     * @return
     */
    Tag getTag(Long id);

    /**
     * 根据name获取一个标签
     *      标签在新增和修改保存时都判断过是否为空和是否已拥有，具体在TagController
     * @param name
     * @return
     */
    Tag getTagByName(String name);

    /**
     * 获取标签列表，使用SpringDataJpa自带Page与Pageable
     * @param pageable
     * @return
     */
    Page<Tag> listTag(Pageable pageable);


    List<Tag> listTag();

    List<Tag> listTags(String ids);

    /**
     * 删除标签
     * @param id
     */
    void deleteTag(Long id);
}
