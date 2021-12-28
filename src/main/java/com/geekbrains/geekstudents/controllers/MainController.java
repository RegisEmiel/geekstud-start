package com.geekbrains.geekstudents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/page")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("favicon.ico")
    String favicon() {
        return "forward:/resources/favicon.ico";
    }
}
