package com.example.mapping.service;

import com.example.mapping.model.Student;
import com.example.mapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;


    public Student saveStudent(Student student) {
    return studentRepository.save(student);
    }

    public List<Student> getStudent() {
        return studentRepository.findAll();
    }

    public List<Student> findStudentById(Long id) {
        return studentRepository.findStudentById(id);
    }

    public List<Student> deleteStudentById(Long id) {
        return studentRepository.deleteStudentById(id);
    }
}
