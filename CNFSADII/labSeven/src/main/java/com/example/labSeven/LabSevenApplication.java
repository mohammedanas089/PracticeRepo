package com.example.labSeven;

import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.net.ssl.SSL;

@SpringBootApplication
public class LabSevenApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(LabSevenApplication.class, args);
        Scanner scanner = new Scanner(System.in);

		StudentService studentService= context.getBean(StudentService.class);
		 
studentService.insertMessage("XYZ",94);
		
		List<Student> cl = studentService.displayMessage();
		
		for(Student m: cl) {
			System.out.println(m.getName());
		}
	}
	
}

