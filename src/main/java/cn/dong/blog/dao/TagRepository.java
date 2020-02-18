package cn.dong.blog.dao;

import cn.dong.blog.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author : Dong
 * @date : 2019/11/24 18:31
 */
public interface TagRepository extends JpaRepository<Tag, Long> {

    /**
     * 通过名字找个标签
     *
     * @param name
     * @return
     */
    Tag findByName(String name);

    /**
     * 根据pageable中的属性查询标签列表
     *
     * @param pageable
     * @return
     */
    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);
}
