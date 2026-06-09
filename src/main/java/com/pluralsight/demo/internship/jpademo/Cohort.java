package com.pluralsight.demo.internship.jpademo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cohort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Cohort(String name) {
        this.name = name;
    }

    public Cohort() {}

    private String name;

}
