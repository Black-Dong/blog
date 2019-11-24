package cn.dong.blog.dao;

import cn.dong.blog.po.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Dong
 * @date : 2019/11/24 18:31
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
    Tag findByName(String name);
}
