package com.webapp.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.web.Model.Student;
import com.webapp.web.Service.Service;

@RestController
public class controller {
    @Autowired
    private Service service;

    @GetMapping("/home")
    public String msg(){
        return "This is a controller class";
    }

    @GetMapping("/Students")
    public List<Student> getStudents(){
        return service.getStudents();
    }

    @GetMapping("/Students/{id}")
    public Student getStudent(@PathVariable Integer id){
        return service.getStudent(id);
    }

    @PostMapping("/addStudent")
    public Student addStudent(@RequestBody Student student){
        return service.addStudent(student);
    }
}
