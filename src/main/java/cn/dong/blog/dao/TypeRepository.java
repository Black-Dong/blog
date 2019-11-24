package cn.dong.blog.dao;

import cn.dong.blog.po.Type;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Dong
 * @date : 2019/11/24 13:29
 */
public interface TypeRepository extends JpaRepository<Type,Long> {

    /**
     * 通过名字找个分类
     * @param name
     * @return
     */
    Type findByName(String name);
}
