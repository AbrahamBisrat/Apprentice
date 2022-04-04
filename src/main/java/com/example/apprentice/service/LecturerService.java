package com.example.apprentice.service;

import com.example.apprentice.domain.Course;
import com.example.apprentice.domain.Lecturer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LecturerService {

    List<Lecturer> findAllLecturers();

    Lecturer findLecturerById(long id);

    void create(List<Lecturer> lecturers);

}
