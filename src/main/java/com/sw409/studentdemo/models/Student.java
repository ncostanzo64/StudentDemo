
package com.sw409.studentdemo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "Students")
public class Student {
	String name;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	int age;

	public Student(String name, Integer id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}