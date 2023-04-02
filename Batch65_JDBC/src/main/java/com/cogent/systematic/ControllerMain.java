package com.cogent.systematic;

import java.sql.SQLException;

public class ControllerMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BusinessLogic bl = new BusinessLogic();
		//bl.createData();
		//bl.updateData();
		//bl.deleteData();
		bl.readData();

	}

}
