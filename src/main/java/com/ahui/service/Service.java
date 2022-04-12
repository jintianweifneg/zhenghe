package com.ahui.service;

import com.ahui.dao.StudentDao;
import com.ahui.domain.Student;

import javax.annotation.Resource;
import java.util.List;

@org.springframework.stereotype.Service
public class Service implements StudentService{
    @Resource
    private StudentDao studentDao;

    @Override
    public int add(Student student) {

        return studentDao.addStudent(student);
    }

    @Override
    public List<Student> cha() {
        return studentDao.chaxun();
    }
}
