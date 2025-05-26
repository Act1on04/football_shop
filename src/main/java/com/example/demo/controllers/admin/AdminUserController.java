package com.example.demo.controllers.admin;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminUserController {

    @Autowired
    private UserService userService;

    @GetMapping("/admin/users")
    public String userList(Model model) {
        model.addAttribute("users", userService.findAll());
        return "admin/users";
    }
}
