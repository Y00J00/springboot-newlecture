package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Notice;

@Mapper
public interface NoticeDao {
    @Select("select * from noticeview")
    List<Notice> getList();

    Notice get();

}
