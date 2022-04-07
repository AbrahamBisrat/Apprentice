package com.example.apprentice.repo;

import com.example.apprentice.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CourseRepo extends JpaRepository<Course, Long> {

    List<Course> findCourseByIdGreaterThan(long id);

}
