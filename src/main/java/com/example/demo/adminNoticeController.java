package com.example.demo;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Notice;
import com.example.demo.service.NoticeService;

@Controller
@RequestMapping("admin/notice/")
public class adminNoticeController {
    
    @Autowired
    private NoticeService service; 

    @RequestMapping("list")
    public String list() {

        List<Notice> list = service.getList();
        return "admin/notice/list";
    }

    @RequestMapping("detail")
    public String detail() {

        Notice notice = service.get(1);
        return "admin/notice/detail";
    }

    @RequestMapping("reg")
    public String reg() {
        return "admin/notice/reg";
    }
}
