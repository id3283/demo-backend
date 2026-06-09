package com.pluralsight.demo.internship.jpademo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CohortRepository extends JpaRepository<Cohort, Long> {
}
