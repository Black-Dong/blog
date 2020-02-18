package cn.dong.blog.web.admin;

import cn.dong.blog.po.Blog;
import cn.dong.blog.po.Tag;
import cn.dong.blog.po.User;
import cn.dong.blog.service.BlogService;
import cn.dong.blog.service.TagService;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 博客管理 的Controller
 *
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

    @Autowired
    private TagService tagService;

    /**
     * 跳转到博客管理页
     *
     * @return
     */
    @GetMapping("/blogs")
    public String list(@PageableDefault(size = 2, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                       BlogSearch blogSearch, Model model) {

        model.addAttribute("types", typeService.listType());
        model.addAttribute("page", blogService.listBlog(pageable, blogSearch));
        return "admin/blogs";
    }

    /**
     * 博客条件查询
     *
     * @param pageable
     * @param blogSearch
     * @param model
     * @return
     */
    @PostMapping("/blogs/search")
    public String search(@PageableDefault(size = 2, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                         BlogSearch blogSearch, Model model) {

        final Page<Blog> page = blogService.listBlog(pageable, blogSearch);

        model.addAttribute("page", page);
        return "admin/blogs :: blogList";
    }

    /**
     * 跳转到博客新增加，为了和修改公用一个页面，传递一个Blog对象
     *
     * @param model
     * @return
     */
    @GetMapping("/blogs/input")
    public String input(Model model) {

        model.addAttribute("blog", new Blog());
        setTypeAndTag(model);
        return "admin/blogs-input";
    }

    /**
     * 新增页和修改页公用  types tags都是搜索选项
     *
     * @param model
     */
    private void setTypeAndTag(Model model) {
        model.addAttribute("types", typeService.listType());
        model.addAttribute("tags", tagService.listTag());
    }

    /**
     * 跳转到博客修改
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/blogs/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        setTypeAndTag(model);
        Blog blog = blogService.getBlog(id);

        // 标签是在前端回显需要的是一串id字符串，需要将blog中的tag集合转化未字符串
        StringBuffer tagIds = new StringBuffer();
        List<Tag> tags = blog.getTags();
        if (!tags.isEmpty()) {
            boolean flag = false;
            for (Tag tag : tags) {
                if (flag) {
                    tagIds.append(",");
                } else {
                    flag = true;
                }
                tagIds.append(tag.getId());
            }
        }
        model.addAttribute("blog", blog);
        model.addAttribute("tagIds", tagIds);
        return "admin/blogs-input";
    }


    /**
     * 新增博客和修改博客的保存
     *
     * @param blog
     * @param tagIds
     * @param session
     * @param redirectAttributes
     * @return
     */
    @PostMapping("/blogs/save")
    public String post(Blog blog, String tagIds, HttpSession session, RedirectAttributes redirectAttributes) {

        blog.setUser((User) session.getAttribute("user"));
        blog.setType(typeService.getType(blog.getType().getId()));
        blog.setTags(tagService.listTags(tagIds));

        final Blog b = blogService.saveBlog(blog);
        if (b == null) {
            redirectAttributes.addFlashAttribute("message", "操作失败");
        } else {
            redirectAttributes.addFlashAttribute("message", "操作成功");
        }

        return "redirect:/admin/blogs";
    }


    /**
     * 删除博客
     *
     * @param id
     * @param redirectAttributes
     * @return
     */
    @GetMapping("/blogs/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        blogService.deleteBlog(id);
        redirectAttributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/blogs";
    }
}
