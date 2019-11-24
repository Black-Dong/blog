package cn.dong.blog.web.admin;

import cn.dong.blog.po.User;
import cn.dong.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;

/**
 * 登陆的 Controller
 * @author : Dong
 * @date : 2019/11/22 9:49
 */
@Controller
@RequestMapping("/admin")
public class LoginController {

    @Autowired
    private UserService userService;

    /**
     * 跳转到登陆页
     * @return
     */
    @GetMapping
    public String loginPage() {
        return "admin/login";
    }

    /**
     * 登陆操作
     * @param username
     * @param password
     * @param session
     * @param redirectAttributes
     * @return
     */
    @PostMapping("/login")
    public String login(@RequestParam String username,
                        @RequestParam String password,
                        HttpSession session,
                        RedirectAttributes redirectAttributes) {
        User user = userService.checkUser(username, password);
        // 获得用户 删除password后存入session
        if (user != null) {
            user.setPassword(null);
            session.setAttribute("user", user);
            return "admin/index";
        } else {
            // 未获取用户 返回错误信息
            redirectAttributes.addFlashAttribute("message","用户名或密码错误");
            return "redirect:/admin";
        }
    }

    /**
     * 注销用户
     * @param session
     * @return
     */
    @GetMapping("/logout")
    public String logout(HttpSession session){
        // 删除session中的user
        session.removeAttribute("user");
        return "redirect:/admin";
    }
}
