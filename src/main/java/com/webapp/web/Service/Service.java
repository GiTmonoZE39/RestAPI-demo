package com.webapp.web.Service;

import java.util.ArrayList;
import java.util.List;

import com.webapp.web.Model.Student;

@org.springframework.stereotype.Service
public class Service {
    private List<Student> list= new ArrayList<>();

    public List<Student> getStudents(){
        list.add(new Student("rony", 5,"bbsr") );
        list.add(new Student("sriansh", 12,"patia") );
        return list;
    }

    public Student getStudent(int id){
        Student stid=null;
        for(Student studentId : list) {
            if (studentId.getRoll() == id){
                stid= studentId;
                break;
            }
        }
        return stid;
    }

    public Student addStudent(Student student){
        list.add(student);
        return student;
    }
}
