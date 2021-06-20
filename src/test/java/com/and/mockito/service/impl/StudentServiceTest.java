package com.and.mockito.service.impl;

import com.and.mockito.dao.StudentDao;
import com.and.mockito.model.Student;
import com.and.mockito.service.StudentService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class StudentServiceTest {
	@Autowired
	private StudentService studentService;

//	@MockBean
//	private StudentDao studentDao;

	@BeforeEach
	void setUp() {
		// 第三方接口没有，那么就自己mock数据出来，执行单元测试之前做的一个事情
//		Mockito.when(studentDao.findById(1)).thenReturn(new Student(2, 18, "Tom"));
	}

	@Test
	void findById() {
		Student student = studentService.findById(1);
		Assert.assertNotNull(student);
//		Assert.assertEquals(student.getAge(), 10);
//		Assert.assertEquals(student.getId(), 2);
		Assertions.assertThrows(RuntimeException.class, () -> {
			Student student1 = studentService.findById(1111);
		});
		studentService.findById(1111);
	}
}