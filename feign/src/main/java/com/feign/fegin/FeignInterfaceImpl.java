package com.feign.fegin;

import com.feign.domain.Student;
import org.springframework.stereotype.Component;

@Component
public class FeignInterfaceImpl implements FeignInterface{
    @Override
    public Student getStu() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
