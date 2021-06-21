package com.example.democontroller.controller;

import com.example.democontroller.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    ArrayList<Student> list=new ArrayList<>();

    @RequestMapping("/addStudent")
    public String addStudent(){
        Student std=new Student("munesh",23,"agra");
        list.add(std);
        return "Student details added...";
    }

    @RequestMapping("/getStudent")
    public ArrayList getStudent(){
        return list;
    }

    @RequestMapping("/updateStudent")
    public String updateStudent(){
        list.get(0).setName("abhishek");
        //return "update complete...";
        return "Updated name is"+list.get(0).getName();
    }

    @RequestMapping("/deleteStudent")
    public String removeStudent(){
        list.remove(0);
        return "Element Removed...";
    }
}
