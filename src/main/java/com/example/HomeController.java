package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.net.http.HttpRequest;

@Controller
public class HomeController {
    /*@RequestMapping("home")
    public String home(@RequestParam("name") String myName, HttpSession session){
        System.out.println("Hii "+myName);
        session.setAttribute("name",myName);
        return "index";
    }*/
    /*@RequestMapping("home")
    public ModelAndView home(@RequestParam("name") String myName){
        ModelAndView mv=new ModelAndView();
        mv.addObject("name",myName);
        mv.setViewName("index");
        return mv;
    }*/
    @RequestMapping("home")
    public ModelAndView home(Alien alien){
        ModelAndView mv=new ModelAndView();
        mv.addObject("obj",alien);
        mv.setViewName("index");
        return mv;
    }
}
