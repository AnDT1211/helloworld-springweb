package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo2Application.class, args);
    }

}

@Controller
class Abc {

    @RequestMapping("today")
    String toFirstPage() {
        return "hello";
    }

    @RequestMapping("tomorrow")
    String toTomorrowPage(HttpServletRequest request, Model model) {
        String usr = request.getParameter("userName");
        System.out.println(usr);

        model.addAttribute("username", usr);
        return "goodBye";
    }

}