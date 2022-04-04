package com.example.apprentice.controller;


import com.example.apprentice.domain.Course;
import com.example.apprentice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    @Autowired
    CourseService courseService;

    @GetMapping()
    public List<Course> findAllCourses(){
        return courseService.findAllCourses();
    }

    @GetMapping("/{id}")
    public Course findCourseById(@PathVariable("id") long id){
        return courseService.findCourseById(id);
    }

    @PostMapping
    public void createCourse(@RequestBody List<Course> courses){
        courseService.create(courses);
    }

}
