package com.example.apprentice.repo;

import com.example.apprentice.domain.Course;
import com.example.apprentice.domain.Lecturer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LecturerRepo extends JpaRepository<Lecturer, Long> {

}
