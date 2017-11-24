package com.servlet;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.service.StudentService;

/**
 * 这个是转发控制层
 * 控制jsp页面的转发
 * 
 * @author Chang-pc
 *
 */

@Controller
public class RequestMapping {
	
	@Autowired
	StudentService studentService;
	
	@org.springframework.web.bind.annotation.RequestMapping("/HelloWorld")
	public String showListStudent(Map<String, Object> map) {
		map.put("listStudent", studentService.getProcessListStudent());
		return "hello";
	}
}











