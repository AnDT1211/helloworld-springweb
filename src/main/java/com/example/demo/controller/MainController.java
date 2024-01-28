package com.example.demo.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("hello")
    String toHelloPage(Model model) {
        model.addAttribute("abc", "Andt");
        model.addAttribute("xyz", "Liem");

        return "hello";
    }

    @RequestMapping("/process")
    String toProcessPage(HttpServletRequest request, Model model) {
        String name = request.getParameter("userName");
        String age = request.getParameter("userAge");
        model.addAttribute("xxx", name);
        model.addAttribute("yyy", age);
        return "process";
    }

}
