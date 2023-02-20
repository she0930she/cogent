package com.cogent.employeeManagementTool;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BusinessLogic {
	Connection conn;
	
	void addEmp() throws SQLException {
		conn = ConnectToDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("INSERT INTO Employees VALUES(?,?)");  
		stmt.setInt(1,111);//1 specifies the first parameter in the query  
		stmt.setString(2,"Janet");  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted"); 
	}
	
	
	
	void readEmp() throws SQLException {
		conn=ConnectToDB.connectSetup();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Employees");
		
		while (rs.next()) {
			// Display values
			System.out.print("ID: " + rs.getInt("PersonID"));
			System.out.println(", Name: " + rs.getString("LastName"));
		}
	}
	
	
	void updateEmp() throws SQLException {
		
		conn=ConnectToDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("UPDATE Employees SET lastName=? WHERE PersonID=?;");  
		stmt.setString(1,"Jonason");//1 specifies the first parameter in the query  
		stmt.setInt(2,111);  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated"); 
	}
	
	
	
	void deleteEmp() throws SQLException {
		
		conn=ConnectToDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("DELETE FROM Employees WHERE lastName=?;");  
		stmt.setString(1,"Janet");//1 specifies the first parameter in the query  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted"); 
		
	}
	

}
