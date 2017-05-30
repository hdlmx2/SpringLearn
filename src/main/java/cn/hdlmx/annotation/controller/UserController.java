package cn.hdlmx.annotation.controller;

import cn.hdlmx.annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    public void excute() {
        System.out.println("UserController add...");
        userService.add();
    }
}
