package com.cogent.batch65_SpringBootThree.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cogent.batch65_SpringBootThree.DAO_repo.MyRepo;
import com.cogent.batch65_SpringBootThree.DAO_repo.StudentRepository;
import com.cogent.batch65_SpringBootThree.entity.Student;
import com.cogent.batch65_SpringBootThree.service.MyServiceClass;

@Controller
//@RequestMapping(value="api/home")  // root API endpoint
public class Controllers {

	
	@Autowired
	MyServiceClass serviceClass;
	 
	    @GetMapping("/hello" )
	    @ResponseBody
	    public String hello()
	    {
	    	
	    	int res=serviceClass.factorial(5);
	        return "Hello All ,Exporing Stereotype Annotations "+ res;
	    }
	
	 @Autowired
	 MyRepo myRepo;
	 
	 @GetMapping("/repo" )
	 @ResponseBody
	 public String repo() {
		 
		 int res = myRepo.disp();
		 return "repo: "+ res;
	 }
	
	 
 
// Base URL

// Type of Http Methods  // RUL or endpoint API      // type of Http Method
		@RequestMapping(value = "info", method = RequestMethod.GET)
		@ResponseBody
		public String getFoo() {
			return "get foo";
		}
	 

	 
	 
	 
	 
	
}