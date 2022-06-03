package com.example.secureapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeControl {
    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
