package com.mrzhan.demo.service.imp;

import com.mrzhan.demo.dao.StudentDAO;
import com.mrzhan.demo.entity.Student;
import com.mrzhan.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    StudentDAO studentDAO;

    @Override
    public List<Student> findAll() {
        return studentDAO.findAll();
    }

    @Override
    public Student findById(Integer id) {
        return studentDAO.findById(id);
    }
}
