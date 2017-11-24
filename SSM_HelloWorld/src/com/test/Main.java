package com.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.dao.StudentDAO;

public class Main {
	public static void main(String[] args) throws IOException {
		
		String resource = "config/MyBatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession session = sqlSessionFactory.openSession(true);
		StudentDAO studentMapper = session.getMapper(StudentDAO.class);
		System.out.println(studentMapper.getListStudent());
	}
}









