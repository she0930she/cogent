package com.cogent.batch65_SpringBootThree.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {
	
	@GetMapping("hello22")
	public String hello() {
		return "Hello22222";
	}

}
