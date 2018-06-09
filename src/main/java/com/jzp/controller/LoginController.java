package com.jzp.controller;

import com.jzp.po.Book;
import com.jzp.po.User;
import com.jzp.service.BookService;
import com.jzp.service.UserService;
import com.jzp.util.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by 蒋志鹏 on 2018/6/7.
 */

@Controller
@RequestMapping("/user/LoginController")
public class LoginController {

    @Resource
    UserService userService;

    @Autowired
    BookService bookService;

    @RequestMapping(value="/login", method= RequestMethod.POST)
    private String doSave(User user, HttpSession session,Model model){
        System.out.println(user);

        User user1 = userService.selectBylogin(user.getUsername(), SecurityUtils.toMD5(user.getPassword()));

        if(user1!=null){
            List<Book> allBook = bookService.findAllBook();
            model.addAttribute("allBook",allBook);
            return "WEB-INF/jsp/index";
        }
        /*redirect:*/
        return "login";
    }
}
