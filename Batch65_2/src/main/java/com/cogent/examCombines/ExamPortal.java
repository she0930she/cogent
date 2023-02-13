package com.cogent.examCombines;

public class ExamPortal {
	static int noq;
	String type;
	String result;
	
	void addQues(int start, int end) {
		
		for (int i = start; i<= end; i++) {
			if (i > 100) {
				System.out.println(i);
			}
		}
	}
	
	void dispQues(int start, int end) {
		for (int i = start; i<= end; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
	
	static void showResult(int num) {
		noq = num;
		if (noq > 40) {
			System.out.println("success: "+ noq);
		}else {
			System.out.println("fail: "+ noq);
		}
	}
	
	
	public ExamPortal(String type, String result) {
		super();
		this.type = type;
		this.result = result;
		System.out.println("parametized constructor: "+ type +", "+ result);
	}
	

}
