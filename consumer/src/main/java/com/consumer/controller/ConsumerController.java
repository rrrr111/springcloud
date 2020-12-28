package com.consumer.controller;

import com.consumer.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {

@Autowired
    private RestTemplate restTemplate;

    @GetMapping("/student")
    public Student getStudent(){
        return  restTemplate.getForObject("http://localhost:8010/getStudent", Student.class);
    }

}
