package com.ysd.dao;

import java.util.List;

import com.ysd.entity.Classes;
import com.ysd.entity.Fenye;
import com.ysd.entity.Student;

public interface StudentMapper {
	Integer selectStuCount(Fenye<Student> fenye);
	List<Student> selectStu(Fenye<Student> fenye);
	//�޸�
	Integer updateStu(Student student);
	
	List<Classes> showClasses();

}
