package cn.dong.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Dong
 * @date : 2019/11/21 14:47
 */
@Controller
public class indexController {

    @GetMapping("/")
    public String index() {
//        int x = 2 / 0;
//        String blog = null;
//        if (blog == null){
//            throw new NotFoundException("博客不存在");
//        }
        System.out.println("--------index---------");
        return "index";
    }

    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
