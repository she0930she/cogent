package com.cogent.servlets;

//A servlet is annotated with only the URL pattern
import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/processForm")
public class MyServlet extends HttpServlet {
 public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws IOException {
     response.getWriter().println("Amanda Welcome back");
 }
}

