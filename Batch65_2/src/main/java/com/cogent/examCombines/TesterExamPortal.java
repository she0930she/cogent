package com.cogent.examCombines;

public class TesterExamPortal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamPortal ep = new ExamPortal("L3", "success");
		ep.addQues(1, 110);
		System.out.println("*******");
		ep.dispQues(990, 1000);
		System.out.println("*******");
		ExamPortal.showResult(50);
		ExamPortal.showResult(39);
		
	}

}
