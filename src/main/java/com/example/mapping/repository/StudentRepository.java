package com.example.mapping.repository;


import com.example.mapping.model.Student;
import org.apache.tomcat.jni.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findStudentById(Long id);

    List<Student> deleteStudentById(Long id);
}
