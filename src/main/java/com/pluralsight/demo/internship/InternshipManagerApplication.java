package com.pluralsight.demo.internship;

import com.pluralsight.demo.internship.jpademo.Cohort;
import com.pluralsight.demo.internship.jpademo.CohortRepository;
import com.pluralsight.demo.internship.jpademo.Student;
import com.pluralsight.demo.internship.jpademo.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class InternshipManagerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(InternshipManagerApplication.class, args);
		StudentRepository studentRepo = applicationContext.getBean(StudentRepository.class);
		CohortRepository cohortRepo = applicationContext.getBean(CohortRepository.class);

		Student student = new Student("Jose", "jose@marbin.com");
		Cohort cohort = new Cohort("Spring 2026");

		cohortRepo.save(cohort);

		student.setCohort(cohort);

		studentRepo.save(student);

	}
}
