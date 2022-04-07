package com.example.apprentice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Lecturer {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private long id;

    private String name;

//    @OneToMany
//    @JoinColumn( name = "lecturer_courses" )
//    private List<Course> course;

    @ManyToOne()
    @JoinColumn( name = "id_studen®t")
    private Student student;

//    @OneToMany( mappedBy = "lecturer")
//    private List<Course> courses;

}
