package cn.dong.blog.web.admin;

import cn.dong.blog.po.Type;
import cn.dong.blog.service.TypeService;
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
 * 分类管理的Controller
 *
 * @author : Dong
 * @date : 2019/11/24 13:44
 */
@Controller
@RequestMapping("/admin/types")
public class TypeController {

    @Autowired
    private TypeService typeService;

    /**
     * 跳转到标签页，使用SpringDataJpa提供的分页
     *
     * @param pageable
     * @param model
     * @return
     */
    @GetMapping
    public String list(@PageableDefault(size = 5, sort = {"id"}, direction = Sort.Direction.DESC)
                                   Pageable pageable,
                       Model model) {

        model.addAttribute("page", typeService.listType(pageable));
        return "admin/types";
    }

    /**
     * 跳转到新增页，
     * 需要向页面传递一个type，目的目的是为了有个服务器端验证标签名是否为空需要用到其中的name
     *
     * @param model
     * @return
     */
    @GetMapping("/input")
    public String input(Model model) {
        // 无实质意义，单纯因为前端需要个对象，方便和修改的共用一个form并有错误提示
        model.addAttribute("type", new Type());
        return "admin/types-input";
    }

    /**
     * \
     * 跳转到修改页，和新增共用同一个页面
     * 需要向页面传递一个 通过id查询到的type，用于回显
     *
     * @param id
     * @param model
     * @return
     */
    @GetMapping("/{id}/input")
    public String editInput(@PathVariable Long id, Model model) {
        model.addAttribute("type", typeService.getType(id));
        return "admin/types-input";
    }

    /**
     * 保存
     * -- 新增与修改公用
     * 因为Jpa新增和修改都是使用save方法，且点击修改时已使用过查询 确定了要修改对象 且对象所有属性都已传递，所以使用同一个方法
     * -- 在Tag中的name属性上使用了@NotBlank(message = "标签不嫩为空")
     * 参数传递@Valid验证Tag之后（必须紧接着Type）使用参数BindingResult类型，
     * 在bindingResult可以获取验证的相关信息，还能自定义错误及信息
     *
     * @param type
     * @param bindingResult
     * @param redirectAttributes
     * @return
     */
    @PostMapping("/save")
    public String saveType(@Valid Type type, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        final boolean state = typeService.getTypeByName(type.getName()) == null ? true : false;
        if (!state) {
            bindingResult.rejectValue("name", "nameError", "不能添加重复分类");
        }
        if (bindingResult.hasErrors()) {
            return "admin/types-input";
        }

        Type t = typeService.saveType(type);
        if (t == null) {
            redirectAttributes.addFlashAttribute("message", "操作失败");
        } else {
            redirectAttributes.addFlashAttribute("message", "操作成功");
        }
        return "redirect:/admin/types";
    }

    /**
     * 删除tag
     *
     * @param id
     * @param redirectAttributes
     * @return
     */
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
        typeService.deleteType(id);
        redirectAttributes.addFlashAttribute("message", "删除成功");
        return "redirect:/admin/types";
    }
}
