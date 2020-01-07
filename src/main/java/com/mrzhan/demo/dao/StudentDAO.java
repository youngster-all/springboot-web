package com.mrzhan.demo.dao;


import com.mrzhan.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
//@Mapper
public interface StudentDAO {
    List<Student> findAll();
    Student findById(@Param("id") Integer id);
}
