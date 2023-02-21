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


@WebServlet("/addpost")
public class AddCustomer extends HttpServlet{
	
	
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
    	//((ServletResponse) request).setContentType("text/html");
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String accountType = request.getParameter("accountType");
        String address = request.getParameter("address");
        
         
        System.out.println("id: " + id);
        System.out.println("last name: " + name);
        System.out.println("account type: " + accountType);
        System.out.println("address: " + address);
        
 
        // do some processing here...
         
        // get response writer
        PrintWriter writer = response.getWriter();
         
        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h2>Your id is: " + id + "<br/>";      
        htmlRespone += "Your last name is: " + name + "</h2>";    
        htmlRespone += "<h2>Your bank account type is: " + accountType + "<br/>";      
        htmlRespone += "Your address is: " + address + "</h2>"; 
        htmlRespone += "</html>";
        
        //////////////////logic to add to database //////
        try {
   
		PreparedStatement stmt=conn.prepareStatement("INSERT INTO BankCustomers values(?,?,?,?)");  
		stmt.setInt(1,Integer.parseInt(id));//1 specifies the first parameter in the query  
		stmt.setString(2,name); 
		stmt.setString(3,accountType);  
		stmt.setString(4,address);  
		  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted");  
		
        }catch(Exception e) {
        	System.out.println("something Wrong");
        }
        /////////////////////////////////////////////////
        
        // return response
        writer.println(htmlRespone);
         
    }

}
