package cn.dong.blog.service;

import cn.dong.blog.po.Blog;
import cn.dong.blog.vo.BlogSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author : Dong
 * @date : 2019/11/25 9:25
 */
public interface BlogService {

    /**
     * 根据id获取一篇博客
     * @param id
     * @return
     */
    Blog getBlog(Long id);

    /**
     * 根据blogSearch 和 pageable中的条件进行分页查询博客列表
     * @param pageable
     * @param blogSearch
     * @return
     */
    Page<Blog> listBlog(Pageable pageable, BlogSearch blogSearch);

    /**
     * 保存博客
     * @param blog
     * @return
     */
    Blog saveBlog(Blog blog);

    /**
     * 删除博客
     * @param id
     */
    void deleteBlog(Long id);
}
