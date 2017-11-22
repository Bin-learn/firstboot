package com.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by  bin
 * Time： 2017/11/22.
 */
@RestController
public class TeacherController {

    @Autowired
    private TeacherRepository teacherRepository;

    @GetMapping("/teacher")
    public List<teacher> show(){
        return teacherRepository.findAll();
    }
}
