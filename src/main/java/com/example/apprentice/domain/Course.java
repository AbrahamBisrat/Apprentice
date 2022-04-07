package com.example.apprentice.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Course {

    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private long id;

    private String name;

//    @ManyToOne()// fetch = FetchType.EAGER, cascade = CascadeType.ALL )
//    @JoinColumn( name = "fk_lecturer")
//    private Lecturer lecturer;
//
//    @ManyToOne()
//    @JoinColumn( name = "fk_student")
//    private Student student;

}
