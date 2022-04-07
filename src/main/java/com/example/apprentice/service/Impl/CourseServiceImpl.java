package com.example.apprentice.service.Impl;

import com.example.apprentice.domain.Course;
import com.example.apprentice.repo.CourseRepo;
import com.example.apprentice.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    CourseRepo courseRepo;

    @Override
    public List<Course> findAllCourses(){
//        courseRepo.findCourseByIdGreaterThan(234);
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
