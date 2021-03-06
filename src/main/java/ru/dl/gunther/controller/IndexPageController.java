package ru.dl.gunther.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class IndexPageController {

    @GetMapping
    public String indexPage0(Model model) {
        return "indexPage";
    }

    @GetMapping("/index")
    public String indexPage1(Model model) {
        return "indexPage";
    }
}
