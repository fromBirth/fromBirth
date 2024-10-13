package com.choongang.frombirth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/common")
public class HomeController {

    @GetMapping("/login")
    public String login() {
        return "common/login";

    }
    @GetMapping("/loginTest")
    public String loginTest() {
        return "common/loginTest";
    }
    @GetMapping("/signup")
    public String signup() {
        return "common/signup";
    }


}

