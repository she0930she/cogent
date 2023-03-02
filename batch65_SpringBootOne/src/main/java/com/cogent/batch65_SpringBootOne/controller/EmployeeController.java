package com.cogent.batch65_SpringBootOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.batch65_SpringBootOne.entity.Employee;
import com.cogent.batch65_SpringBootOne.repo.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	
//	@Bean(name="entityManagerFactory")
//	public EmployeeRepository employeeRepository() {
//		EmployeeRepository employeeRepository = new EmployeeRepository();
//
//	    return employeeRepository;
//	} 
	
	// HTTP Methods, POST, GET, DELETE, PUT
	
	
	
	@GetMapping("getemp")
	public List<Employee> getEmployee() {
		
		
		System.out.println("get emp here");
		return employeeRepository.findAll();

	}
	
	
	@PostMapping("addemp")
	public Employee addEmployee(@RequestBody Employee newEmployee) {
		System.out.println("add emp here");
		return employeeRepository.save(newEmployee);
	}
	
	
	
	@PutMapping("updateemp")
	void updateEmployee() {
		
	}
	
	
	@DeleteMapping("deleteemp/{id}")
	void deleteEmployee(@PathVariable("id") int id) {
		
		System.out.println("delete emp id: "+ id);
		employeeRepository.deleteById(id);
	}

}
