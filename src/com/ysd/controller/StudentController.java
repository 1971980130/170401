package com.ysd.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ysd.entity.Classes;
import com.ysd.entity.Fenye;
import com.ysd.entity.Student;
import com.ysd.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@Autowired
	private Fenye<Student> fenye;
	
	
	@RequestMapping(value="/showStu",method=RequestMethod.POST)
	@ResponseBody
	public  Fenye<Student> showStu(Classes classes,Student student,Fenye<Student> fenye, Integer page,Integer rows){
		student.setClasses(classes);
		
		fenye.setStudent(student);
		
		fenye.setPage((page-1)*rows);
		fenye.setPageSize(rows);
		
		fenye= studentService.selectStu( fenye);
		
		return fenye;
		
	}
	@RequestMapping(value="/updateStu",method=RequestMethod.POST)
	@ResponseBody
	public Integer  updateStu(Classes classes,Student student){
		student.setClasses(classes);
		return studentService.updateStu(student);
	}
	//查询所有的班级
	@RequestMapping(value="/showClasses",method=RequestMethod.POST)
	@ResponseBody
	public List<Classes> showClasses(){
		return studentService.showClasses();
	}
	
	
	
	
	
	
}
