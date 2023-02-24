package com.cogent.databasePrac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/fetch")
public class GetData {
	
	Connection conn;
	ArrayList <Product> ls = new ArrayList<>();
	
	
	
	 public void doGet(
			 HttpServletRequest request, 
			 HttpServletResponse response)
	         throws IOException {
		 
	     response.getWriter().println("Amanda Welcome back");
	     PrintWriter writer = response.getWriter();
	     
	     String DB_DRIVER = "com.mysql.jdbc.Driver";
	     String DB_URL = "jdbc:mysql://localhost/batch65";
	     String USER = "root";
	     String PASS = "12345678";


	     
	     try {
	    		// Register PostgreSQL Driver
	    		Class.forName(DB_DRIVER);
	    	}
	    	catch (ClassNotFoundException e) {
	    		System.out.println("Unable to load Driver class");
	    		// e.printStackTrace(); OR you
	    		// can directly print the stack trace
	    		System.exit(1);
	    	}

	     // read data
	     try {
			  Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		         String queryRead = "SELECT * FROM Products";
		         ResultSet rs = stmt.executeQuery(queryRead);
			  
		    	      
		         while(rs.next()){
		            //Display values
		        	System.out.print("ID: " + rs.getInt("ProductID"));
		 			System.out.println(", Name: " + rs.getString("ProductName"));
		            
		            
		            int id = rs.getInt("ProductID");
		            String lastName = rs.getString("ProductName");
		            writer.println("id: "+ id);
		            writer.println("product name: "+ lastName);
		            
					System.out.println("print ArrayList");
					ls.add(new Product(
							rs.getInt("ProductID"), 
							rs.getString("ProductName"), 
							rs.getFloat("ProductCost"),
							rs.getFloat("ProductDiscount"),
							rs.getInt("ProductAvailable"),
							rs.getInt("ProductSold")
							));
					System.out.println(ls);
		           
		         }
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
	 
	     

	 }
	 
	 
	 

}
