package com.cogent.connectMySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectMySQL {
	   static final String DB_URL = "jdbc:mysql://localhost/batch65";
	   static final String USER = "root";
	   static final String PASS = "12345678";
	   static  String QUERY = "SELECT * FROM Persons";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// connect mySQL
		
		
		// Query
		
		// resultSet
		
		
//		// read operation
//	      try {
//	    		  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//	    	         Statement stmt = conn.createStatement();
//	    	         ResultSet rs = stmt.executeQuery(QUERY);
//	    		  
//	    	    	      
//	    	         while(rs.next()){
//	    	            //Display values
//	    	            System.out.print("ID: " + rs.getInt("PersonID"));
//	    	            System.out.println(", LastName: " + rs.getString("LastName"));
//	    	           
//	    	         }
//	    	      } catch (SQLException e) {
//	    	         e.printStackTrace();
//	    	      } 

	      
	      // Insert operation
//	      try {
//    		  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//    	      //Statement stmt = conn.createStatement();
//    	      //QUERY = "INSERT INTO Persons (PersonID, lastName) VALUES (116, 'Peterson');";
//    	      //boolean rs = stmt.executeQuery(QUERY);
//    	      //boolean rs = stmt.execute(QUERY);	
//  			PreparedStatement stmt=conn.prepareStatement("insert into persons values(?,?)");  
//  			stmt.setInt(1,118);//1 specifies the first parameter in the query  
//  			stmt.setString(2,"Le Cai");  
//  			  
//  			int i=stmt.executeUpdate();  
//  			System.out.println(i+" records inserted"); 
//
//	    	      } catch (SQLException e) {
//	    	         e.printStackTrace();
//	    	      } 
	      
	      
	      // delete operation
	      try {
    		  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	      Statement stmt = conn.createStatement();
    	      QUERY = "DELETE FROM Persons WHERE lastName='Le Cai';";
    	      boolean rs = stmt.execute(QUERY);	

	    	      } catch (SQLException e) {
	    	         e.printStackTrace();
	    	      } 
	      
	      // update operation
	      try {
    		  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    	      Statement stmt = conn.createStatement();
    	      QUERY = "UPDATE Persons SET lastName='Ubun' WHERE PersonID=113;";
    	      boolean rs = stmt.execute(QUERY);	

	    	      } catch (SQLException e) {
	    	         e.printStackTrace();
	    	      } 
	      
	      // read operation
	      try {
	    		  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	    	         Statement stmt = conn.createStatement();
	    	         String queryRead = "SELECT * FROM Persons";
	    	         ResultSet rs = stmt.executeQuery(queryRead);
	    		  
	    	    	      
	    	         while(rs.next()){
	    	            //Display values
	    	            System.out.print("ID: " + rs.getInt("PersonID"));
	    	            System.out.println(", LastName: " + rs.getString("LastName"));
	    	           
	    	         }
	    	      } catch (SQLException e) {
	    	         e.printStackTrace();
	    	      } 
	      
	      
	      
	}

}
