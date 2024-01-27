package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
class MainController {
    @RequestMapping("")
    String indextPage() {
        return "index";
    }

    @RequestMapping("/hello")
    String toHelloPage() {
        return "hello";
    }
}
