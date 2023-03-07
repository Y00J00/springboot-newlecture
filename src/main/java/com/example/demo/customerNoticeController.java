package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("customer/notice/")
public class customerNoticeController {
    @RequestMapping("list")
    public String list(Model model) {
        model. addAttribute("test", "hello");
        return "customer/notice/list"; //resource view resolver
        //return "customer.notice.list"; tiles view resolver

    }
    @RequestMapping("detail")
    public String detail() {
        return "customer/notice/detail";
    }
    @RequestMapping("reg")
    public String reg() {
        return "customer/notice/reg";
    }
}
