package edu.mum.cs.waa.lab.controller;

import edu.mum.cs.waa.lab.domain.User;
import edu.mum.cs.waa.lab.service.AdviceService;
import edu.mum.cs.waa.lab.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
public class LoginController {
    private UserService userService;
    private AdviceService adviceService;
    @Autowired
    public LoginController(UserService userService, AdviceService adviceService){
        this.adviceService = adviceService;
        this.userService = userService;
    }

    @GetMapping("/login")
    public String showLoginForm(){
        return "login";
    }
    @PostMapping("login")
    public String login(User user){
        String password = user.getPassword();
        String expected = userService.findPassword(user.getName());
        if(!password.equals(expected) || password == null ){
            return "login";
        }
        else{
            return "LoginSuccessful";
        }
    }


}
