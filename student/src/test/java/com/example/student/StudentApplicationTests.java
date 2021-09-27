package com.example.student;

import com.example.student.DAO.Student;
import com.example.student.DAO.StudentDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentApplicationTests {
	@Autowired
	StudentDao studentDao;
	@Test
	void contextLoads() {
		Student student=new Student();
		student.setId("1");
		student.setName("test");
		student.setMarks(100);
		System.out.println("Inside the test");
		studentDao.create(student);
		studentDao.delete(student);
	}

}
