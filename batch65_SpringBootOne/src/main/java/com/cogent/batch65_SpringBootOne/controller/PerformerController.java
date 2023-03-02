package com.cogent.batch65_SpringBootOne.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.batch65_SpringBootOne.entity.Performer;
import com.cogent.batch65_SpringBootOne.repo.PerformerRepository;



@RestController
public class PerformerController {
	
	@Autowired
	PerformerRepository performerRepository;
	
	
	@GetMapping("getperformer")
	public List<Performer> getPerformer() {
		
		System.out.println("get performer here");
		return performerRepository.findAll();
	}
	
	@PostMapping("addperformer")
	public Performer addPerformer(@RequestBody Performer newPerformer) {
		
		System.out.println("add performer here");
		return performerRepository.save(newPerformer);
	}
	
	
	@DeleteMapping("deleteperformer/{id}")
	public void deletePerformer(@PathVariable int id) {
		
		System.out.println("delete performer here");
		performerRepository.deleteById(id);
	}
	
	
	
	
	
	void updatePerformer() {
		
	}
	

}
