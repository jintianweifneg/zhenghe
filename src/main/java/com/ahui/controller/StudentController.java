package com.ahui.controller;

import com.ahui.domain.Student;
import com.ahui.service.Service;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private Service service;

    @RequestMapping("/addStudent.do")
    public ModelAndView add(Student student){
        ModelAndView mv=new ModelAndView();
        if(service.add(student)>0){
            mv.addObject("tips",student.toString());
            mv.setViewName("result");
        }
        return mv;
    }

    @RequestMapping("/cha.do")
    @ResponseBody
    public List<Student> list(){
        List<Student> students=service.cha();
        return students;
    }

}
