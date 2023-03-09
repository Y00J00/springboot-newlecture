package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.NoticeDao;
import com.example.demo.entity.Notice;

@Service
public class NoticeServiceImp implements NoticeService{
    @Autowired
    private NoticeDao noticeDao;

    @Override
    public List<Notice> getList() {

        List<Notice> list = noticeDao.getList();
       
        return list;
    }

    @Override
    public Notice get(int i) {

        Notice notice = noticeDao.get();

        return notice;
    }
    
}
