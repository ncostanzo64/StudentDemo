package com.sw409.studentdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.studentdemo.models.Student;
import com.sw409.studentdemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService stuService;

	// CREATE
	@PostMapping("api/v1/students")
	public Student addStudent(@RequestBody Student s) {
		return stuService.addStudent(s);

	}

	// READ
	@GetMapping("api/v1/students")
	public List<Student> getStudents() {
		return stuService.getStudents();

	}

	// UPDATE
	@PatchMapping("api/v1/students/{stuid}")
	public void updateStudent(@PathVariable("stuid") Integer id, @RequestBody Student s) {
		stuService.updateStudent(id, s);

	}

	// DELETE
	@DeleteMapping("api/v1/students/{stuid}")
	public void deleteStudent(@PathVariable("stuid") Integer id) {
		stuService.deleteStudent(id);
	}
}
