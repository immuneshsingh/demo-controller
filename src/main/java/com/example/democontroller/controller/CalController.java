package com.example.democontroller.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalController {

    @RequestMapping("/addition/{a}/{b}")
    public int addPathVariable(@PathVariable int a,@PathVariable int b){
        int calculation = a+b;
        return  calculation;
    }

    @RequestMapping("/addition")
    public int addRequestParam(@RequestParam int a, @RequestParam int b){
        int calculation = a+b;
        return calculation;
    }

    @RequestMapping("/sub/{a}/{b}")
    public int subPathVariable(@PathVariable int a,@PathVariable int b){
        int calculation = a-b;
        return calculation;
    }

    @RequestMapping("/sub")
    public int subRequestParam(@RequestParam int a, @RequestParam int b){
        int calculation = a-b;
        return calculation;
    }

    @RequestMapping("/multi/{a}/{b}")
    public int multiPathVariable(@PathVariable int a,@PathVariable int b){
        int calculation = a*b;
        return calculation;
    }

    @RequestMapping("/multi")
    public int multiRequestParam(@RequestParam int a, @RequestParam int b){
        int calculation = a*b;
        return calculation;
    }

    @RequestMapping("/div/{a}/{b}")
    public int divPathVariable(@PathVariable int a,@PathVariable int b){
        int calculation = a/b;
        return calculation;
    }

    @RequestMapping("/div")
    public int divRequestParam(@RequestParam int a, @RequestParam int b){
        int calculation = a/b;
        return calculation;
    }
}
