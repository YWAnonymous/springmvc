package com.zhou.service;

import com.zhou.pojo.Books;

import java.util.List;

public interface BookService {

    List<Books> findAll();

    List<Books> findByPage();
}
