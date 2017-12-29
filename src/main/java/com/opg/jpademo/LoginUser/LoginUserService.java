package com.opg.jpademo.LoginUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by fan.shijun on 2017-12-04.
 */
@Controller
//@EnableAutoConfiguration
public class LoginUserService {

    @Autowired
    LoginUserRepository userRepository;

    @RequestMapping("/login")
    public String login(Model model) {
        LoginUser user = new LoginUser();
        model.addAttribute("user", user);
        return "/login";
    }

    @RequestMapping("/userForm")
    public String userForm(Model model) {
        return "/userForm";
    }

    @RequestMapping("/home")
    public String home(Model model) {
        return "/home";
    }

    @RequestMapping("/loginSubmit")
    public String loginSubmit(LoginUser user, Model model, HttpSession session) {
        System.out.println(user.getUserName() + "  " + user.getUserPwd());
        List<LoginUser> userlist = userRepository.findByNameAndPwd(user.getUserName(), user.getUserPwd());
        if (userlist.isEmpty()) {
            return "redirect:/login";
        } else {
            model.addAttribute("userName", user.getUserName());
            session.setAttribute("cur_user", user.getUserName());
            return "/home";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("cur_user");
        return "redirect:/login";
    }

    @RequestMapping(value = "/user/save", method = RequestMethod.POST)
    @ResponseBody
    public LoginUser save(@RequestBody LoginUser user) {
        return userRepository.save(user);
    }

    @RequestMapping(value = "/user/delete", method = RequestMethod.POST)
    @ResponseBody
    public String delete(@RequestBody LoginUser user) {
        userRepository.delete(user);
        return "{}";
    }

    @RequestMapping("/user/all")
    @ResponseBody
    public List<LoginUser> all() {
        return userRepository.findAll();
    }

}
