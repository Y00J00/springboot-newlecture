package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
    @RequestMapping("/help")
    public String help() {
        return "help";
    }
    
}
