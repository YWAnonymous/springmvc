package com.zhou.controller;

import com.zhou.annotation.SystemLog;
import com.zhou.pojo.Books;
import com.zhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/find")
    @SystemLog(module = "查询模块",methods = "查询全部书籍")
    public ModelAndView find(){
        ModelAndView mv = new ModelAndView();
        List<Books> list = bookService.findAll();
        System.out.println("list"+list);
        mv.addObject("list",list);
        mv.setViewName("test");
        return mv;
    }
}
