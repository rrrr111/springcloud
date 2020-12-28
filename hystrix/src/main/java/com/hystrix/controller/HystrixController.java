package com.hystrix.controller;

import com.hystrix.domain.Student;
import com.hystrix.fegin.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hystrix")
public class HystrixController {


    @Autowired
    FeignInterface feignInterface;

    @GetMapping("/getstu")
    public Student getstu(){
        return feignInterface.getStu();
    }

    @GetMapping("/index")
    public String index(){
        return feignInterface.index();
    }

}
