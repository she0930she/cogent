package com.cogent.servlets;

//A servlet is annotated with only the URL pattern
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fetch")
public class GetData extends HttpServlet {
	
	
 public void doGet(HttpServletRequest request, HttpServletResponse response)
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
	         String queryRead = "SELECT * FROM Persons";
	         ResultSet rs = stmt.executeQuery(queryRead);
		  
	    	      
	         while(rs.next()){
	            //Display values
	            System.out.print("ID: " + rs.getInt("PersonID"));
	            System.out.println(", LastName: " + rs.getString("LastName"));
	            
	            
	            int id = rs.getInt("PersonID");
	            String lastName = rs.getString("LastName");
	            writer.println("id: "+ id);
	            writer.println("last name: "+ lastName);
	           
	         }
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
 
     

 }
 
 
 
}

