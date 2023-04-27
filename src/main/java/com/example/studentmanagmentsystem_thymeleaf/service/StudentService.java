package com.example.studentmanagmentsystem_thymeleaf.service;

import com.example.studentmanagmentsystem_thymeleaf.entity.Student;

import java.util.List;

public interface StudentService  {
    List<Student> getAllStudent();
    Student saveStudent(Student student);

}
