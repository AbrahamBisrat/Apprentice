package com.example.apprentice.service;

import com.example.apprentice.domain.Course;
import com.example.apprentice.domain.Lecturer;
import com.example.apprentice.domain.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    List<Student> findAllStudents();

    Student findStudentById(long id);

    void create(List<Student> students);

}
