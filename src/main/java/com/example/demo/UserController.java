package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/hello") 
    public String getHello(){
        return "hello yuju";
    }

    @PostMapping("/join")
    public String join(){
        
    }
}
