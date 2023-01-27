package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("api")
public class StudentControlller {
    
    @GetMapping("/data")
    public List<Student> getStudentInfo(){
        List<Student> list = new ArrayList<>();
        Student student = new Student("Sakthi", "22");
        Student student2 = new Student("sapient", "21");
        list.add(student);
        list.add(student2);
        return list;
    }
}
