package com.cogent.batch65_SpringBootThree.service;

import org.springframework.stereotype.Component;

@Component
public class MyServiceClass {
	
	public int factorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n* factorial(n-1);
	}
	
}
