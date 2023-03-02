package com.cogent.batch65_SpringBootOne.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    // Http Methods gets defined
public class Controller { 
	
	// end point, URL for REST API
	
	
	@GetMapping("/hello")  // endpoint for API, or URL endpoint
	public String hello() {
		System.out.println("Hello Amanda");
		return "<h1>hello world</h1>";
	}
	
	
	public int addition(int a, int b) {
		return a+b;
	}
	
	@GetMapping("/add")
	public String display() {
		int res = addition(3,7);
		System.out.println("displying~~");
		
		return "<h1>the result is: "+res+"</h1>";
	}
	

}