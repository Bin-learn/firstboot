package com.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by  bin
 * Time： 2017/11/21.
 */
@RestController
public class HelloBoot {

//    @Value("${age}")
//    private String age;

    @Autowired
    private student student;

    @RequestMapping(value = "/hello", method = RequestMethod.GET )
    public String hello(){
        return student.getAge()+" "+student.getHeight();
    }
}
