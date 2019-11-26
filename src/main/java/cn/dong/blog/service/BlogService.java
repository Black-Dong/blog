package cn.dong.blog.service;

import cn.dong.blog.po.Blog;
import cn.dong.blog.vo.BlogSearch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author : Dong
 * @date : 2019/11/25 9:25
 */
public interface BlogService {

    /**
     * 根据id获取一篇博客
     *
     * @param id
     * @return
     */
    Blog getBlog(Long id);

    /**
     * 根据blogSearch 和 pageable中的条件进行分页查询博客列表
     *
     * @param pageable
     * @param blogSearch
     * @return
     */
    Page<Blog> listBlog(Pageable pageable, BlogSearch blogSearch);

    /**
     * 根据pageable中的条件进行分页查询博客列表
     *
     * @param pageable
     * @return
     */
    Page<Blog> listBlog(Pageable pageable);

    /**
     * 根据search内容分页查询
     * @param pageable
     * @param search
     * @return
     */
    Page<Blog> listBlog(String search,Pageable pageable);

    /**
     * 查找size条推荐博客
     * @param size
     * @return
     */
    List<Blog> listRecommendBlogTop(Integer size);

    /**
     * 保存博客
     *
     * @param blog
     * @return
     */
    Blog saveBlog(Blog blog);

    /**
     * 删除博客
     *
     * @param id
     */
    void deleteBlog(Long id);
}
