package cn.dong.blog.web;

import cn.dong.blog.service.BlogService;
import cn.dong.blog.service.TagService;
import cn.dong.blog.service.TypeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Dong
 * @date : 2019/11/21 14:47
 */
@Controller
public class IndexController {

    @Autowired
    private BlogService blogService;

    @Autowired
    private TypeService typeService;

    @Autowired
    private TagService tagService;


    /**
     * 跳转首页
     *
     * @return
     */
    @GetMapping("/")
    public String index(@PageableDefault(sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        Model model) {

        model.addAttribute("page", blogService.listBlog(pageable));
        model.addAttribute("types", typeService.listTypeTop(6));
        model.addAttribute("tags", tagService.listTagTop(10));
        model.addAttribute("recommendBlogs", blogService.listRecommendBlogTop(8));

        return "index";
    }

    /**
     * 根据传入的search条件查询标题和内容，查询除博客列表返回
     *
     * @param pageable
     * @param search
     * @param model
     * @return
     */
    @RequestMapping("/search")
    public String search(@PageableDefault(sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                         @RequestParam String search,  Model model) {
        model.addAttribute("page",blogService.listBlog("%"+search+"%",pageable));
        model.addAttribute("search",search);
        return "search";
    }

    /**
     * 跳转博客详情页
     * @return
     */
    @GetMapping("/blog/{id}")
    public String blog(@PathVariable Long id, Model model) {

        model.addAttribute("blog",blogService.getAndConvertBlog(id));
        return "blog";
    }


    @GetMapping("/footer/newblogs")
    public String newblogs(Model model){

        model.addAttribute("newblogs",blogService.listRecommendBlogTop(3));
        return "_fragments::newblogList";
    }
}
