package com.example.democontroller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/Welcome")
    public String welcome(){
        return "Welcome to the Home Page...";
    }
}
