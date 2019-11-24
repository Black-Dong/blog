package cn.dong.blog.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 博客管理 的Controller
 * @author : Dong
 * @date : 2019/11/24 11:38
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    /**
     * 跳转到博客管理页
     * @return
     */
    @GetMapping("/blogs")
    public String list(){
        return "admin/blogs";
    }
}
