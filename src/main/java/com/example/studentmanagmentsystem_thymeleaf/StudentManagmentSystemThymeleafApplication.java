package com.example.studentmanagmentsystem_thymeleaf;

import com.example.studentmanagmentsystem_thymeleaf.entity.Student;
import com.example.studentmanagmentsystem_thymeleaf.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
@RequiredArgsConstructor
public class StudentManagmentSystemThymeleafApplication{

	private final StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemThymeleafApplication.class, args);
	}


}
