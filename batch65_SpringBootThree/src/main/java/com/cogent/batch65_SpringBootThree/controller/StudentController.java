package com.cogent.batch65_SpringBootThree.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.batch65_SpringBootThree.DAO_repo.StudentRepository;
import com.cogent.batch65_SpringBootThree.entity.Student;

@RestController
public class StudentController {
	
	
	 @Autowired
	 StudentRepository studRepo;
	 
	 @PostMapping("/addstud")
		public @ResponseBody Student register(@RequestBody Student student) {
			return studRepo.save(student);
		}

	 
	 
	 @GetMapping("/getstud" )
	 @ResponseBody
	 public List<Student> getStudent() {
		 
		 
		 return studRepo.findAll();
	 }

}
