package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/notice/")
public class adminNoticeController {
    @RequestMapping("list")
    public String list() {
        return "admin/notice/list";
    }

    @RequestMapping("detail")
    public String detail() {
        return "admin/notice/detail";
    }

    @RequestMapping("reg")
    public String reg() {
        return "admin/notice/reg";
    }
}
