package com.ribbon.controller;

import com.ribbon.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/ribbon")
public class RibbonController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/getstu")
    public Student getStu(){
        return restTemplate.getForObject("http://provider/getStudent", Student.class);
    }

    @GetMapping("/index")
    public String index(){
        return restTemplate.getForObject("http://provider/index" ,String.class);
    }

}
