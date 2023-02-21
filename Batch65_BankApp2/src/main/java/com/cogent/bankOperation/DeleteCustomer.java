package com.cogent.bankOperation;


import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/deletePost")
public class DeleteCustomer extends HttpServlet{
	
	
private static final long serialVersionUID = 1L;
	
	final String URL = "jdbc:mysql://localhost/batch65";
	final String USER = "root";
	final String PASSWORD = "12345678";
	final String DRIVER = "com.mysql.jdbc.Driver";
	Connection conn = null;

	public void init() throws ServletException {

		// Database connection through Driver Manager
		try {
			Class.forName(DRIVER);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	
	
 
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
         
        // read form fields
    	response.setContentType("text/html");
        String deletedId = request.getParameter("id");
        
        
        System.out.println("del_id: " + deletedId);

 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your id is deleted: " + deletedId + "<br/>";      
        htmlRespone += "</html>";
        
        //////////////////logic to add to database //////
        try {
   
		PreparedStatement stmt=conn.prepareStatement("DELETE FROM BankCustomers WHERE PersonID=?;");  
		stmt.setInt(1,Integer.parseInt(deletedId));//1 specifies the first parameter in the query  

		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  
		
        }catch(Exception e) {
        	System.out.println("something Wrong");
        }
        /////////////////////////////////////////////////
        
        // return response
        writer.println(htmlRespone);
         
    }
	

}
