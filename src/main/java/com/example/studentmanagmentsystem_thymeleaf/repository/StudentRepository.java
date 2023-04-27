package com.example.studentmanagmentsystem_thymeleaf.repository;

import com.example.studentmanagmentsystem_thymeleaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}
