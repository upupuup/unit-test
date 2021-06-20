package com.and.mockito.service.impl;

import com.and.mockito.dao.StudentDao;
import com.and.mockito.model.Student;
import com.and.mockito.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 * ctrl + shift + t
 * @Author:         jiangzhihong
 * @CreateDate:     2021/6/20 10:56
 */
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student findById(int id) {
		if (id > 10) {
			throw new RuntimeException("no!");
		}
		return studentDao.findById(id);
	}
}
