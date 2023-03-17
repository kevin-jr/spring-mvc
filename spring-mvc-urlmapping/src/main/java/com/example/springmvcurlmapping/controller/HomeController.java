package com.example.springmvcurlmapping.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class HomeController {


    @GetMapping({"/","/home"})
    public String sayHello(Model model){
        model.addAttribute("taglib", "hello sayHello mvc.......");
        return "home";
    }


    @GetMapping("/hello")
    public String saySpring(Model model){
        model.addAttribute("taglib", "Hello saySrping MVC");

        return "Home";
    }
}
