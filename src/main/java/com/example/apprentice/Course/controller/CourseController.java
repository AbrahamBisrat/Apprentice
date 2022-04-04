package com.example.apprentice.Course.controller;


import com.example.apprentice.Course.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/courses")
public class CourseController {

    @GetMapping()
    public List<Course> findAllCourses(){
        return null;
    }

    @GetMapping("/{id}")
    public Course findCourseById(@PathVariable("id") Long id){
        return null;
    }


}
