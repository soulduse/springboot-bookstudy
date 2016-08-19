package com.soul.study.controller;

import com.soul.study.domain.User;
import com.soul.study.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by sould on 2016-08-19.
 */

@Controller
@RequestMapping("users")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(method = RequestMethod.GET)
    String list(Model model){
        List<User> users = userService.findAll();
        model.addAttribute("users", users);
        return "users/list";
    }


}
