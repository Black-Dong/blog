package cn.dong.blog.web.admin;

import cn.dong.blog.po.Blog;
import cn.dong.blog.service.BlogService;
import cn.dong.blog.service.TypeService;
import cn.dong.blog.vo.BlogSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 博客管理 的Controller
 * @author : Dong
 * @date : 2019/11/24 11:38
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    /**
     * 跳转到博客管理页
     * @return
     */
    @GetMapping("/blogs")
    public String list(@PageableDefault(size = 2,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                       BlogSearch blogSearch, Model model){

        model.addAttribute("types", typeService.listType());
        model.addAttribute("page",blogService.listBlog(pageable, blogSearch));
        return "admin/blogs";
    }


    @PostMapping("/blogs/search")
    public String search(@PageableDefault(size = 2,sort = {"updateTime"},direction = Sort.Direction.DESC) Pageable pageable,
                         BlogSearch blogSearch, Model model){

        final Page<Blog> page = blogService.listBlog(pageable, blogSearch);

        model.addAttribute("page",page);
        return "admin/blogs :: blogList";
    }
}
