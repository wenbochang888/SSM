package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.DAO.DeleteStudent;
import com.DAO.InsertStudent;
import com.DAO.QueryStudent;
import com.po.Student;

@org.springframework.stereotype.Service
public class Service {
	
	@Autowired
	QueryStudent queryStudent;
	
	@Autowired
	InsertStudent insertStudent;
	
	@Autowired
	DeleteStudent deleteStudent;
	
	public List<Student> getListStudent() {
		
		return queryStudent.getListStudent();
	}
	
	public void insertStudent(Student student) {
		Map<String, Object> map = new HashMap<>();
		map.put("sno", student.getSno());
		map.put("sname", student.getSname());
		map.put("phone", student.getPhone());
		insertStudent.insertStudent(map);
	}
	
	public void deleteStudent(String sno) {
		deleteStudent.deleteStudent(sno);
	}
}





