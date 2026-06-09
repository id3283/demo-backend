package com.pluralsight.demo.internship;

import com.pluralsight.demo.internship.jpademo.Student;
import com.pluralsight.demo.internship.jpademo.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class InternshipManagerApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext beanBag = SpringApplication.run(InternshipManagerApplication.class, args);

		Student student = new Student("Marbin", "marbin@marbin.com");

		StudentRepository repo = beanBag.getBean(StudentRepository.class);
		repo.save(student);

		System.out.println();

	}

//	public void mangleParam(Student )

}
