package cn.dong.blog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : Dong
 * @date : 2019/11/27 22:04
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(){


        return "about";
    }
}
