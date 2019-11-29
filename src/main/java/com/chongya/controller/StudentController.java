package com.chongya.controller;

import com.chongya.dto.AddStudentDto;
import com.chongya.pojo.Student;
import com.chongya.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fangshiping
 * @date 2019/11/29 9:26
 */
@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping(value = "/get")
    public Student get(@RequestBody AddStudentDto dto){
        return service.get(dto);
    }

    @GetMapping(value = "/getDefault")
    public Student getDefault(){
        return service.getDefault();
    }
}
