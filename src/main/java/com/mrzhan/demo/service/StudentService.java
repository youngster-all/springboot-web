package com.mrzhan.demo.service;

import com.mrzhan.demo.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
}
