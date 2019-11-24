package cn.dong.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author : Dong
 * @date : 2019/11/21 14:47
 */
@Controller
public class IndexController {

    /**
     * 跳转首页
     * @return
     */
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

    /**
     * TODO: 这个之后写
     * @return
     */
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }
}
