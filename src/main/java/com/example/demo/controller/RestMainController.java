package com.example.demo.controller;

import com.example.demo.model.Car;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestMainController {

    @GetMapping("test")
    Car hello(HttpServletRequest request) {
        String carName = request.getParameter("carname");
        int carAge = Integer.valueOf(request.getParameter("carage"));
        return new Car(carName, carAge);
    }

}


