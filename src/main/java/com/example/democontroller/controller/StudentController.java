package com.example.democontroller.controller;

import com.example.democontroller.model.Student;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.stream.Stream;

@RestController
public class StudentController {

    ArrayList<Student> list=new ArrayList<>();

    @RequestMapping("/addStudent")
    public String addStudent(@RequestBody Student student){
        list.add(student);
        return "Student details added...";
    }


    @RequestMapping("/dispStudent")
    public ArrayList<Student> dispStudent() {

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
