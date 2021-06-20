package com.and.mockito.dao;

import com.and.mockito.model.Student;
import org.springframework.stereotype.Component;

/*
 * @Author:         jiangzhihong
 * @CreateDate:     2021/6/20 10:54
 */
@Component
public class StudentDao {
	public Student findById(int id) {
		Student student = new Student(1, 10, "Tony");
		return student;
	}
}
