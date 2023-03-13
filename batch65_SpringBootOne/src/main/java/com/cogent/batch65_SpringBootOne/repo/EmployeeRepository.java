package com.cogent.batch65_SpringBootOne.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cogent.batch65_SpringBootOne.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	// database Connect and Query ... by different ways
	
	
	
}
