package com.example.apprentice.service.Impl;

import com.example.apprentice.domain.Course;
import com.example.apprentice.domain.Student;
import com.example.apprentice.repo.CourseRepo;
import com.example.apprentice.repo.StudentRepo;
import com.example.apprentice.service.CourseService;
import com.example.apprentice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepo studRepo;

    @Override
    public List<Student> findAllStudents(){
        return studRepo.findAll();
    }

    @Override
    public Student findStudentById(long id){
        return studRepo.findById(id).orElse(null);
    }

    @Override
    public void create(List<Student> students){
        students.forEach(student -> studRepo.save(student));
    }

}
