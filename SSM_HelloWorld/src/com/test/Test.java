package com.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.service.StudentService;

class Test {

	@Autowired
	StudentService s;
	
	@org.junit.jupiter.api.Test
	void test() {
		
		System.out.println(s);
	}

}
