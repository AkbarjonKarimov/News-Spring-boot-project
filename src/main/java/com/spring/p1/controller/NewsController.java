package com.spring.p1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class NewsController {

//    private final NewsController newsController;
//
//    @Autowired
//    public NewsController(NewsController newsController) {
//        this.newsController = newsController;
//    }
//
//    @GetMapping()
//    public String login(Model model){
//        model.addAttribute("people",newsController.login(null));
//        return "templates/login1";
//    }
}
