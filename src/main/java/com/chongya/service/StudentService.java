package com.chongya.service;

import com.chongya.dto.AddStudentDto;
import com.chongya.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author fangshiping
 * @date 2019/11/29 9:23
 */
@Service
public class StudentService {
    public Student get(AddStudentDto dto){
        Student student=new Student();
        student.setId(222L);
        student.setName(dto.getName());
        student.setPassword(dto.getPassword());
        return student;
    }

    public Student getDefault(){
        Student student=new Student();
        String randomName= String.valueOf(new Random().nextInt(10))+"小米";
        String randomPwd= String.valueOf((int)(Math.random() * 1000000));
        student.setId(222L);
        student.setName(randomName);
        student.setPassword(randomPwd);
        return student;
    }
}
