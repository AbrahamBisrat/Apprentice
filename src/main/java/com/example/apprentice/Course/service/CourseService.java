package com.example.apprentice.Course.service;

import com.example.apprentice.Course.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    List<Course> findAllCourses();

    Course findCourseById(long id);

    void create(List<Course> course);

}
