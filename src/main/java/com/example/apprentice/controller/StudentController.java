package com.example.apprentice.controller;


import com.example.apprentice.domain.Student;
import com.example.apprentice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<Student> findAllStudents(){
        return studentService.findAllStudents();
    }

    @GetMapping("/{id}")
    public Student findStudentById(@PathVariable("id") long id){
        return studentService.findStudentById(id);
    }

    @PostMapping
    public void createStudent(@RequestBody List<Student> students){
        studentService.create(students);
    }

}
