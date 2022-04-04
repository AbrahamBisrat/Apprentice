package com.example.apprentice.controller;


import com.example.apprentice.domain.Course;
import com.example.apprentice.domain.Lecturer;
import com.example.apprentice.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/lecturers")
public class LecturerController {

    @Autowired
    LecturerService lecturerService;

    @GetMapping()
    public List<Lecturer> findAllLecturers(){
        return lecturerService.findAllLecturers();
    }

    @GetMapping("/{id}")
    public Lecturer findLecturerById(@PathVariable("id") long id){
        return lecturerService.findLecturerById(id);
    }

    @PostMapping
    public void createLecturer(@RequestBody List<Lecturer> lecturers){
        lecturerService.create(lecturers);
    }


}
