package com.cogent.batch65_SpringBootOne.exceptions;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;


@ControllerAdvice
public class EmployeeExceptionController {
	
	
/*
 * 2 approaches
 * 1. return @ResponseBody, errors
 * 2. return ResponseEntity<Object>
 * 
 * */


	

	@ResponseStatus(code =HttpStatus.BAD_REQUEST )
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseBody
		public   HashMap<String, String> handleValidationExceptions(

	  MethodArgumentNotValidException ex) {

	    HashMap<String, String> errors = new HashMap<>();
	    ex.getBindingResult().getAllErrors().forEach((error) -> {
	        String fieldName = ((FieldError) error).getField();
	        String errorMessage = error.getDefaultMessage();
	        errors.put(fieldName, errorMessage);
	        System.out.println("====== Error obj2: "+ errors);
	    });
	   return errors;
	    //return new ResponseEntity<Object>(errors, HttpStatus.BAD_REQUEST);
	}

	
	
	// customizeexception
	
	@ExceptionHandler(value = ResourceNotFoundException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	   public ResponseEntity<Object> exception3(ResourceNotFoundException exception) {
	      return new ResponseEntity<>("Resource not found2", HttpStatus.NOT_FOUND);
	   }

	
	
	
}
