package com.example.apprentice.service.Impl;

import com.example.apprentice.domain.Lecturer;
import com.example.apprentice.repo.LecturerRepo;
import com.example.apprentice.service.LecturerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LecturerServiceImpl implements LecturerService {

    @Autowired
    LecturerRepo lecturerRepo;

    @Override
    public List<Lecturer> findAllLecturers(){
        return lecturerRepo.findAll();
    }

    @Override
    public Lecturer findLecturerById(long id){
        return lecturerRepo.findById(id).orElse(null);
    }

    @Override
    public void create(List<Lecturer> lecturers){
        lecturers.forEach(lec -> lecturerRepo.save(lec));
    }

}
