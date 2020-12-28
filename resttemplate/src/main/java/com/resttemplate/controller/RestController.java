package com.resttemplate.controller;

import com.resttemplate.dimain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/rest")
public class RestController {


    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/student")
    public Student getStudent(){
        return  restTemplate.getForObject("http://localhost:8010/getStudent", Student.class);
    }
}
