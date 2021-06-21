package com.example1.demo1.controller;

    import com.example1.demo1.entity.Student;
    import com.example1.demo1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/code")
    public class StudentController {



        @Autowired
        StudentRepository studentRepository;

        @GetMapping
public  List<Student> getAllStudents(){
            System.out.println("getting all students");
            return studentRepository.findAll();
        }
    }





