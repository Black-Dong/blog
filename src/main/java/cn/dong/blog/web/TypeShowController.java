package cn.dong.blog.web;

import cn.dong.blog.po.Type;
import cn.dong.blog.service.BlogService;
import cn.dong.blog.service.TypeService;
import cn.dong.blog.vo.BlogSearch;
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
public class TypeShowController {

    @Autowired
    private TypeService typeService;

    @Autowired
    private BlogService blogService;

    @GetMapping("/types/{id}")
    public String types(@PathVariable Long id, @PageableDefault(sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                        Model model) {
        List<Type> types = typeService.listType();
        if (id == -1) {
            id = types.get(0).getId();
        }

        BlogSearch blogSearch = new BlogSearch();
        blogSearch.setTypeId(id);
        model.addAttribute("types", types);
        model.addAttribute("page", blogService.listBlog(pageable, blogSearch));
        model.addAttribute("activeTypeId", id);

        return "types";
    }
}
