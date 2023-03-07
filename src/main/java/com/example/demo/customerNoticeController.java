package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Notice;
import com.example.demo.service.NoticeService;

@Controller
@RequestMapping("customer/notice/")
public class customerNoticeController {
    
    @Autowired
    private NoticeService service;

    @RequestMapping("list")
    public String list(Model model) {

        List<Notice> list = service.getList();
        model. addAttribute("list", list);
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
