package com.mrzhan.demo.controller;

import com.mrzhan.demo.entity.Student;
import com.mrzhan.demo.service.StudentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @GetMapping(value = "/login")
    public List<Student> loginHandle(){
        return studentService.findAll();
    }
    @GetMapping(value = "/login/{id}")
    public Student findOne(@Param("id") Integer id){
        return studentService.findById(id);
    }
}
