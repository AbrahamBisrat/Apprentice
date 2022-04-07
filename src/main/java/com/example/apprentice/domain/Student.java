package com.example.apprentice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Student {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private long id;

    private String name;

    @OneToMany( mappedBy = "student")//, cascade = CascadeType.ALL )
//    @Fetch()
    private List<Lecturer> lecturers;

//    @OneToMany( mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private List<Course> courses;

}
