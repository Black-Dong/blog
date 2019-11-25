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

    Blog getBlog(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogSearch blogSearch);

    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
