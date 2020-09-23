package com.lnt.lntspringbootredis.controller;

import com.lnt.lntspringbootredis.entity.Student;
import com.lnt.lntspringbootredis.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @author Lakshminarayanan
 * @created 20/07/20 5:24 PM
 */
@RestController
public class RedisController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/save")
    public Student saveStudent() {
        Student student = new Student(
                "Eng2015001", "John Doe", Student.Gender.MALE, 1);
        studentRepository.save(student);
        return student;
    }

    @GetMapping("/get")
    public Student getStudent() {
        Student retrievedStudent =
                studentRepository.findById("Eng2015001").get();
        return retrievedStudent;
    }


}
