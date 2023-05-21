package com.student.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.config.SortByName;
import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000/")
public class StudentController {
	
	
	@Autowired
	private StudentService studentService;

	@Autowired
	private IdGenerator generator;
	
	
	//save the student-info in database
	@PostMapping("/student")
	public Student saveStudent(@RequestBody Student student)
	{
		student.setRegdId(generator.generate());
		return this.studentService.saveStudent(student);
	}
	
	//display all the student by name
	@GetMapping("/student")
	public List<Student> displayAll(){
		//return this.studentService.displayStudent();
		List<Student> list=this.studentService.displayByName();
	return list;
	}
	

}
