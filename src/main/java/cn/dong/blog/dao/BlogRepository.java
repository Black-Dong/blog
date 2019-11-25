package cn.dong.blog.dao;

import cn.dong.blog.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

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
}
