package com.cogent.exceptionPrac;

public class VoterApp {
	void passAgeRestriction(int num) throws AgeException {
		if (num < 18) {
			throw new AgeException("you are under 18, can not vote");
		}else {
			System.out.println("passed age restriction");
		}
		
		System.out.println("success");
	}

}
