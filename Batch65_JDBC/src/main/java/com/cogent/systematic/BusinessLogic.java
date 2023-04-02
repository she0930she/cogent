package com.cogent.systematic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.SQLException;



//import com.mysql.cj.xdevapi.Statement;

public class BusinessLogic {
	Connection conn;
	
	
	void createData() throws SQLException {
		
		conn=ConnectDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("INSERT INTO Persons VALUES(?,?)");  
		stmt.setInt(1,120);//1 specifies the first parameter in the query  
		stmt.setString(2,"Yuhao Fan");  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted"); 
		
	}
	
	
	void readData() throws SQLException {
		
		conn=ConnectDB.connectSetup();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Persons");
		
		ArrayList <Person> ls = new ArrayList<>();
		
		while (rs.next()) {
			// Display values
			System.out.print("ID: " + rs.getInt("PersonID"));
			System.out.println(", Name: " + rs.getString("LastName"));
			
			System.out.println("print ArrayList");
			ls.add(new Person(rs.getInt("PersonID"), rs.getString("LastName") ));
			System.out.println(ls);
		}

		
	}
	
	void updateData() throws SQLException {
		
		conn=ConnectDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("UPDATE Persons SET lastName=? WHERE PersonID=?;");  
		stmt.setString(1,"Jonason2");//1 specifies the first parameter in the query  
		stmt.setInt(2,120);  
		//stmt.executeUpdate();
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated"); 
		
	}
	
	void deleteData() throws SQLException {
		
		conn=ConnectDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("DELETE FROM Persons WHERE lastName=?;");  
		stmt.setString(1,"Jonason2");//1 specifies the first parameter in the query  
		//stmt.setInt(2,120);  
		//stmt.executeUpdate();
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted"); 
		
		
	}

}
