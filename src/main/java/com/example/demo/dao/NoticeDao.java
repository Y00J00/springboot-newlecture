package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Notice;

public interface NoticeDao {
    @Select("select * from notice")
    List<Notice> getList();
    Notice get();

}
