package com.cogent.servlets;

//A servlet is annotated with only the URL pattern
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hi") // annotation config url
							// start with @ symbol
// create a servlet by implement Servlet interface
public class NewServlet extends HttpServlet {
public void doGet(HttpServletRequest request, HttpServletResponse response)
       throws IOException {
	
	
	
	
	
   response.getWriter().println("Amanda");
   PrintWriter writer = response.getWriter();

   writer.println("Hi Amanda welcome!!");
   
}
   
}
