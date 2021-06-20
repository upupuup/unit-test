package com.and.mockito.model;

/*
 * @Author:         jiangzhihong
 * @CreateDate:     2021/6/20 10:52
 */
public class Student {
	private int id;
	private int age;
	private String name;

	public Student(int id, int age, String name) {
		this.id = id;
		this.age = age;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
