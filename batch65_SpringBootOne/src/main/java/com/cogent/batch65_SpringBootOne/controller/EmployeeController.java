package com.cogent.batch65_SpringBootOne.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.batch65_SpringBootOne.entity.Employee;
import com.cogent.batch65_SpringBootOne.exceptions.ResourceNotFoundException;
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
	public Employee addEmployee(
			@Valid 
			@RequestBody Employee newEmployee) {
		System.out.println("add emp here");
		return employeeRepository.save(newEmployee);
	}
	
	
	
	@PutMapping("updateemp/{id}")
	public ResponseEntity<Employee> updateEmployee(
			@PathVariable("id") int id,
			@RequestBody Employee newEmp
			) {
		Optional<Employee> existingEmp = employeeRepository.findById(id);
		
		if (existingEmp.isPresent()) {
			
			Employee tmpEmp = existingEmp.get();
			tmpEmp.setName(newEmp.getName());
			tmpEmp.setDept(newEmp.getDept());
			tmpEmp.setSalary(newEmp.getSalary());
			
			return new ResponseEntity<>(employeeRepository.save(tmpEmp), HttpStatus.OK);
			
		}else {
			System.out.println("not found in update");
			throw new ResourceNotFoundException("no such id");
			//return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	@DeleteMapping("deleteemp/{id}")
	void deleteEmployee(@PathVariable("id") int id) {
		
//		if (!employeeRepository.deleteById(id) ) {
//			throw new ResourceNotFoundException("Data not there");
//		}
		
		
		System.out.println("delete emp id: "+ id);
		employeeRepository.deleteById(id);
	}

	
	@GetMapping("trygetemp")
	public void tryGetEmployee() {
		int i = 10;
		if (i == 10) {
			throw new ResourceNotFoundException("Datanot there");
		}
		
		System.out.println("try get emp here");
		
	}
	
	
	
}
