package com.ysd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ysd.dao.StudentMapper;
import com.ysd.entity.Classes;
import com.ysd.entity.Fenye;
import com.ysd.entity.Student;
@Service
public class StudentServiceImp implements StudentService {
	
	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Fenye<Student> selectStu(Fenye<Student> fenye) {
		Integer selectStuCount = studentMapper.selectStuCount(fenye);
		List<Student> selectStu = studentMapper.selectStu(fenye);
		fenye.setRows(selectStu);
		fenye.setTotal(selectStuCount);
		return fenye;
	}

	@Override
	public Integer updateStu(Student student) {
		// TODO Auto-generated method stub
		return studentMapper.updateStu(student);
	}

	@Override
	public List<Classes> showClasses() {
		// TODO Auto-generated method stub
		return studentMapper.showClasses();
	}

}
