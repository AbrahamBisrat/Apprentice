package com.example.apprentice.service;

import com.example.apprentice.domain.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    List<Course> findAllCourses();

    Course findCourseById(long id);

    void create(List<Course> course);

}
