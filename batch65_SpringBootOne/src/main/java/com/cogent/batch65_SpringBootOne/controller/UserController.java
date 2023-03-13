package com.cogent.batch65_SpringBootOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.cogent.batch65_SpringBootOne.entity.User;
import com.cogent.batch65_SpringBootOne.repo.UserRepository;


@CrossOrigin // port 4200 -> accept port 4200
@RestController
public class UserController {

	
	@Autowired
	UserRepository userRepository;
	
	@GetMapping("getuser")
	public List<User> getUsers() {
		
		
		System.out.println("get users here");
		return userRepository.findAll();

	}
	
}
