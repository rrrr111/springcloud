package com.feign.controller;

import com.feign.domain.Student;
import com.feign.fegin.FeignInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
public class FeignController {

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
