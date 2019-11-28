package cn.dong.blog.dao;

import cn.dong.blog.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * JpaRepository : 含有对数据库的简单操作
 * JpaSpecificationExecutor : 含有 like where 等特殊一点的操作
 * <p>
 * 接口可以多继承接口
 *
 * @author : Dong
 * @date : 2019/11/25 9:54
 */
public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {

    /**
     * 根据pageable中的属性查询博客列表
     *
     * @param pageable
     * @return
     */
    @Query("select b from Blog b where b.recommendStatus = true")
    List<Blog> findTop(Pageable pageable);

    @Query("select b from Blog b where b.title like ?1 or b.content like ?1")
    Page<Blog> findBlogsBySearch(String search, Pageable pageable);


    /**
     * select date_format(b.updateTime, '%Y') as year from t_blog b group by year order by year desc;
     *
     * @return
     */
    @Query("select function('date_format',b.updateTime,'%Y') as year from Blog b group by function('date_format',b.updateTime,'%Y') order by year desc")
    List<String> findGroupYear();

    /**
     * select * from t_blog b where date_from(b.updateTime, '%Y') = 'yyyy';
     *
     * @param year
     * @return
     */
    @Query("select b from Blog b where function('date_format',b.updateTime,'%Y') = ?1")
    List<Blog> findByYear(String year);

    /**
     * 修改浏览次数
     *
     * @param id
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @Modifying
    @Query("update Blog b set b.views = b.views+1 where b.id = ?1")
    int updateViews(Long id);
}
