package com.sw409.studentdemo.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sw409.studentdemo.controller.repositories.StudentRepository;
import com.sw409.studentdemo.models.Student;

@Service
public class StudentService {

	@Autowired
	StudentRepository stuRepo;
	List<Student> studentList = new ArrayList<>();

	// CREATE

	public Student addStudent(Student stu) {

		studentList.add(stu);
		return stuRepo.save(stu);
	}

	// READ

	public List<Student> getStudents() {

		return (List<Student>) stuRepo.findAll();
	}

	// UPDATE

	public void updateStudent(Integer id, Student s) {
		Student oldStudent = stuRepo.findById(id).get();
		oldStudent.setAge(s.getAge());
		oldStudent.setName(s.getName());
		stuRepo.save(s);

	}

	// DELETE
	public void deleteStudent(Integer id) {
		stuRepo.deleteById(id);
	}
}
