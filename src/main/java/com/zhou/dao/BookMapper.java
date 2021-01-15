package com.zhou.dao;

import com.zhou.pojo.Books;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface BookMapper {

    List<Books> findAll();
}
