package com.example.apprentice.Course.service;

import com.example.apprentice.Course.Course;
import com.example.apprentice.Course.repository.CourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    CourseRepo courseRepo;

    @Override
    public List<Course> findAllCourses(){
        return courseRepo.findAll();
    }

    @Override
    public Course findCourseById(long id){
        return courseRepo.findById(id).orElse(null);
    }

    @Override
    public void create(List<Course> courses){
        courses.forEach(course -> courseRepo.save(course));
    }

}
