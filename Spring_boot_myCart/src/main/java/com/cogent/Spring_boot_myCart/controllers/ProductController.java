package com.cogent.Spring_boot_myCart.controllers;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.Spring_boot_myCart.entity.Product;
import com.cogent.Spring_boot_myCart.repo.ProductRepository;



@CrossOrigin
@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepo;

	
//	@Bean(name="entityManagerFactory")
//	public EmployeeRepository employeeRepository() {
//		EmployeeRepository employeeRepository = new EmployeeRepository();
//
//	    return employeeRepository;
//	} 
	
	// HTTP Methods, POST, GET, DELETE, PUT
	
	@GetMapping("hello")
	public String sayHello() {
		
		return "hello you are in My Cart";
	}
	
	
	@GetMapping("getproduct")
	public List<Product> getProducts() {
		
		
		System.out.println("get product here");
		return productRepo.findAll();

	}
	
	@PostMapping("addproduct")
	public Product addProduct(
			 
			@RequestBody Product newProduct) {
		System.out.println("add product here");
		return productRepo.save(newProduct);
	}
	
	
	
	@PutMapping("updateemp/{id}")
	public ResponseEntity<Product> updateProductDetail(
			@PathVariable("id") int id,
			@RequestBody Product newProduct
			) {
		Optional<Product> existingPrud = productRepo.findById(id);
		
		if (existingPrud.isPresent()) {
			
			Product tmpPrud = existingPrud.get();
			tmpPrud.setName(newProduct.getName());
			tmpPrud.setDescription(newProduct.getDescription());
			tmpPrud.setCost(newProduct.getCost());
			
			return new ResponseEntity<>(productRepo.save(tmpPrud), HttpStatus.OK);
			
		}else {
			System.out.println("not found in update");
			
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	
	@DeleteMapping("deleteproduct/{id}")
	void deleteProduct(@PathVariable("id") int id) {
		
		System.out.println("delete product id: "+ id);
		productRepo.deleteById(id);
	}

}
