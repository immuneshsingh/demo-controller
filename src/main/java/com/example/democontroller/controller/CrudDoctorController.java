package com.example.democontroller.controller;

import com.example.democontroller.model.Doctor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CrudDoctorController {

    List<Doctor> docList=new ArrayList<>();

    //create
    @RequestMapping("/add_doc")
    public String add(){

        Doctor doc1=new Doctor("Dr. Anand",65,"Heart");
        docList.add(doc1);

        return doc1.getName() + " Added Successfully ...";
    }

    //get
    @RequestMapping("/get_all_doc")
    public List <Doctor> getdocList(){

        return docList;
    }
   // update

    @RequestMapping("/update_doc")
    public String update(){

        docList.get(0).setName("Dr. Hajra");

        return "Name Updated Successfully....";
    }

    // delete

    @RequestMapping("/delete_doc")
    public String remove(){

        docList.remove(0);
        return "Doctor Entry deleted successfully ......";
    }


}
