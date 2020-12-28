package com.hystrix.fegin;

import com.hystrix.domain.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "provider",fallback = FeignInterfaceImpl.class)//熔断机制
public interface FeignInterface {
    @GetMapping("/getStudent")
    public Student getStu();

    @GetMapping("/index")
    public String index();
}
