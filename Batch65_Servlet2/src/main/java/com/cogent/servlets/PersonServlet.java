package com.cogent.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PersonServlet")
public class PersonServlet extends HttpServlet{
	
	//private static final long serialVersionUID = 1 L;
	
    String DB_DRIVER = "com.mysql.jdbc.Driver";
    String DB_URL = "jdbc:mysql://localhost/batch65";
    String USER = "root";
    String PASS = "12345678";

    
    
    public void init(HttpServletRequest request, HttpServletResponse response)
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

    }
	
	
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    	int Id = Integer.parseInt(req.getParameter("id"));
        String lastName = req.getParameter("lastName");
        
        
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();


        System.out.println("Id :: " + Id);
        System.out.println("lastName :: " + lastName);
        
        PreparedStatement pstmt;
        
        try {
        	Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
    		//conn=ConnectDB.connectSetup();
    		PreparedStatement stmt=conn.prepareStatement("INSERT INTO Persons VALUES(?,?)");  
    		stmt.setInt(1,Id);//1 specifies the first parameter in the query  
    		stmt.setString(2,lastName);  
    		int i=stmt.executeUpdate();  
    		System.out.println(i+" records inserted"); 
    		
        }catch (SQLException e) {
	         e.printStackTrace();
	      } 
        
        

    }

}
