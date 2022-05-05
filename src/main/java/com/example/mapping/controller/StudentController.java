package com.example.mapping.controller;

import com.example.mapping.model.Student;
import com.example.mapping.repository.StudentRepository;
import com.example.mapping.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/student")
@Slf4j
@Transactional
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/save")
    public Student saveStudent(@RequestBody Student student){
        log.info("Inside the saveStudent.");
        return studentService.saveStudent(student);
    }

    @GetMapping("/get")
    public List<Student> getStudents(){
        log.info("Inside the getStudents.");
        return studentService.getStudent();
    }
    @GetMapping("/v1/getStudent/{id}")
    public List<Student> getStudentById(@PathVariable("id") Long id){
        return studentService.findStudentById(Long.valueOf(id));
    }
    @DeleteMapping("/v1/deleteStudent/{id}")
    public List<Student> deleteStudentById(@PathVariable("id") Long id){
        return studentService.deleteStudentById(id);
    }

}
