package com.cogent.employeeManagementTool;

import java.sql.SQLException;

public class Controller {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		BusinessLogic bl = new BusinessLogic();
		bl.addEmp();
		bl.updateEmp();
		bl.deleteEmp();
		bl.readEmp();
		

	}

}
