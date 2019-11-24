package cn.dong.blog.web.admin;

import cn.dong.blog.po.Tag;
import cn.dong.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

/**
 * @author : Dong
 * @date : 2019/11/24 18:22
 */
@Controller
@RequestMapping("/admin/tags")
public class TagsController {

    @Autowired
    private TagService tagService;

    @GetMapping
    public String List(@PageableDefault(size = 5, sort = {"id"}, direction = Sort.Direction.DESC) Pageable pageable,
                       Model model) {

        model.addAttribute("page",tagService.listTag(pageable));
        return "admin/tags";
    }

    @GetMapping("/input")
    public String input(Model model){
        // 无实质意义，单纯因为前端需要个对象，方便和修改的共用一个form并有错误提示
        model.addAttribute("tag",new Tag());
        return "admin/tags-input";
    }

    @GetMapping("/{id}/input")
    public String editInput(@PathVariable Long id, Model model){
        model.addAttribute("tag", tagService.getTag(id));
        return "admin/tags-input";
    }

    @PostMapping("/save")
    public String saveType(@Valid Tag type, BindingResult bindingResult, RedirectAttributes redirectAttributes){
        final boolean state = tagService.getTagByName(type.getName()) == null ? true : false;
        if (!state){
            bindingResult.rejectValue("name","nameError","不能添加重复分类");
        }
        if (bindingResult.hasErrors()){
            return "admin/tags-input";
        }

        Tag t = tagService.saveTag(type);
        if (t == null){
            redirectAttributes.addFlashAttribute("message","操作失败");
        }else{
            redirectAttributes.addFlashAttribute("message","操作成功");
        }
        return "redirect:/admin/tags";
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id,RedirectAttributes redirectAttributes){
        tagService.deleteTag(id);
        redirectAttributes.addFlashAttribute("message","删除成功");
        return "redirect:/admin/tags";
    }
}
