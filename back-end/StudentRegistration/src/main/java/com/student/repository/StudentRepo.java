package com.student.repository;

import java.util.List;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.student.entity.Student;

public interface StudentRepo extends MongoRepository<Student, String>{
	
	List<Student> findAllByOrderByNameAsc();

}
