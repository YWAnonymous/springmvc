package com.zhou.service.impl;

import com.zhou.dao.BookMapper;
import com.zhou.pojo.Books;
import com.zhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;

    public List<Books> findAll() {
        return bookMapper.findAll();
    }
}
