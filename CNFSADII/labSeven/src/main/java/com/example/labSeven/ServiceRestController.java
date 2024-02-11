package com.example.labSeven;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ServiceRestController {
	
	@Autowired
	private StudentRepository studentRepository; 
	
	@GetMapping
	public List<Student> getStudentdetails() {
		return studentRepository.findAll();
	}
	@GetMapping("/{id}")
	public Student getspecificStudentdetails(@PathVariable int id) {
        return studentRepository.findById(id).orElse(null);
	}
	@PostMapping
	public Student addStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	

}
