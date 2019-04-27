package com.ysd.service;

import java.util.List;

import com.ysd.entity.Classes;
import com.ysd.entity.Fenye;
import com.ysd.entity.Student;

public interface StudentService {
	
	Fenye<Student> selectStu(Fenye<Student> fenye);
	
	Integer updateStu(Student student);

	List<Classes> showClasses();
}
