package com.client.controller;

import com.client.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/getStudent")
    public Student findAll(){
        return new Student(1L,"张三",18);
    }

    @GetMapping("/index")
    public String index(){
        return port;
    }

}
