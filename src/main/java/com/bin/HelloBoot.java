package com.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by  bin
 * Time： 2017/11/21.
 */
@RestController
@RequestMapping("/say")
public class HelloBoot {

//    @Value("${age}")
//    private String age;

    @Autowired
    private student student;

    @GetMapping({"/hello", "/hi"})
    public String hello(@RequestParam(value="id", defaultValue = "0") Integer id){

        return "id:"+id;
    }
}
