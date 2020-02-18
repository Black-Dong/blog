package cn.dong.blog.web;

import cn.dong.blog.po.Tag;
import cn.dong.blog.service.BlogService;
import cn.dong.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author : Dong
 * @date : 2019/11/27 16:25
 */
@Controller
public class TagShowController {

    @Autowired
    private TagService tagService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/tags/{id}")
    public String tags(@PathVariable Long id,
                       @PageableDefault(sort = {"updateTime"}, direction = Sort.Direction.DESC)
                               Pageable pageable,
                       Model model) {
        List<Tag> tags = tagService.listTag();
        if (id == -1) {
            id = tags.get(0).getId();
        }


        model.addAttribute("tags", tags);
        model.addAttribute("page", blogService.listBlog(pageable, id));
        model.addAttribute("activeTagId", id);

        return "tags";
    }
}
