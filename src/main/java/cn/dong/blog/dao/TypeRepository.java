package cn.dong.blog.dao;

import cn.dong.blog.po.Type;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

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

    /**
     * 根据pageable中的属性查询分类列表
     * @param pageable
     * @return
     */
    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);
}
