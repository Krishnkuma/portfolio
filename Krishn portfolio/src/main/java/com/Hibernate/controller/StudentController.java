package com.Hibernate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Hibernate.enity.Student;
import com.Hibernate.repository.StudentRepository;

import jakarta.validation.Valid;

@RestController
public class StudentController {

	
	StudentRepository repository;

	public StudentController(StudentRepository repository) {
		super();
		this.repository = repository;
	}
	
	@PostMapping("/insert")
	public ResponseEntity<Student> insert(@Valid @RequestBody Student student ){
		
		Student savedStudent=repository.save(student);
		
		return  new ResponseEntity<>(savedStudent,HttpStatus.CREATED);
		
	}
	
	
	
	
	
	
	
	
}
