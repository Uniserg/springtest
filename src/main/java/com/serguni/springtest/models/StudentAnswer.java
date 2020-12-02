package com.serguni.springtest.models;

import javax.persistence.*;

@Entity
@Table(name = "student_answer")
public class StudentAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "row_id")
    private int id;


}
