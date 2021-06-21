package com.example.democontroller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class CrudElementController {
    ArrayList list=new ArrayList();

    @RequestMapping("/add")
    public String addElement(){
        list.add("Munesh");
        return "'Munesh' is added in the list...";
    }

    @RequestMapping("/get")
    public ArrayList getElement(){
        return list;
    }

    @RequestMapping("/update")
    public String updateElement(){
        list.set(0,"java");
        return "updated name is "+list.get(0);
    }

    @RequestMapping("/delete")
    public String removeElement(){
        list.remove(0);
        return "first element of list is removed...";
    }
}
