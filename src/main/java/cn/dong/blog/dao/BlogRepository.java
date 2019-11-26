package cn.dong.blog.dao;

import cn.dong.blog.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 *
 * JpaRepository : 含有对数据库的简单操作
 * JpaSpecificationExecutor : 含有 like where 等特殊一点的操作
 *
 * 接口可以多继承接口
 * @author : Dong
 * @date : 2019/11/25 9:54
 */
public interface BlogRepository extends JpaRepository<Blog, Long> , JpaSpecificationExecutor<Blog> {

    /**
     * 根据pageable中的属性查询博客列表
     * @param pageable
     * @return
     */
    @Query("select b from Blog b where b.recommendStatus = true")
    List<Blog> findTop(Pageable pageable);

    @Query("select b from Blog b where b.title like ?1 or b.content like ?1")
    Page<Blog> findBlogsBySearch( String search,Pageable pageable);
}
