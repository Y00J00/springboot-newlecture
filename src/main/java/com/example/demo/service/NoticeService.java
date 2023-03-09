package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Notice;

public interface NoticeService {

    List<Notice> getList();

    Notice get(int i);

}
