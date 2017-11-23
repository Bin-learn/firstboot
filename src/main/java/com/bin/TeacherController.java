package com.bin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<Teacher> show(){
        return teacherRepository.findAll();
    }

    @PostMapping("/add")
    public Teacher add(@RequestParam("name") String name){
        Teacher teacher = new Teacher();
        teacher.setName(name);
        return teacherRepository.save(teacher);
    }

    //查询
    @GetMapping(value = "/teacher/{id}")
    public Teacher select(@PathVariable("id") Integer id){
        return teacherRepository.findOne(id);
    }

    //删除
    @DeleteMapping(value = "/teacher/{id}")
    public void delete(@PathVariable("id") Integer id){
        teacherRepository.delete(id);
    }

    //更新
    @PutMapping(value = "/teacher/{id}")
    public Teacher update(@PathVariable("id") Integer id,
                          @RequestParam("name") String name){
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setName(name);
        return teacherRepository.save(teacher);
    }

    //根据名字查询
    @GetMapping("/teacher/name")
    public List<Teacher> selectByName(@RequestParam("name") String name){
       return teacherRepository.findByName(name);
    }

}
