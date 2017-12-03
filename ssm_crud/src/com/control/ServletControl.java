package com.control;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.po.Student;
import com.service.Service;

@Controller
public class ServletControl {
	
	@Autowired
	Service service;
	
	@RequestMapping(value = "/delete")
	public String deleteStudent(String sno) {
		
		service.deleteStudent(sno);
		return "forward:/showAllStudent";
	}
	
	@RequestMapping(value = "/addStudent")
	public String addStudent(Student student) {
		
		service.insertStudent(student);
		return "forward:/showAllStudent";
	}
	
	@RequestMapping("/showAllStudent")
	public String getListStudent(Map<String, Object> map) {
		
		map.put("students", service.getListStudent());
		return "index";
	}
}







