package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.StudentDAO;
import com.po.Student;

/**
 * �����ҵ���߼���
 * д�������ݺ�ķ�װ
 *  
 * @author Chang-pc
 *
 */

@Service
public class StudentService {
	
	@Autowired
	StudentDAO studentDAO;
	
	public List<Student> getProcessListStudent() {
		return studentDAO.getListStudent();
	}
	
	public void test() {
		System.out.println(studentDAO);
	}
}




















