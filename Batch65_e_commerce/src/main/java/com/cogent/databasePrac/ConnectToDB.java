package com.cogent.databasePrac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletException;

public class ConnectToDB {
	
	   static final String DB_URL = "jdbc:mysql://localhost/batch65";
	   static final String USER = "root";
	   static final String PASS = "12345678";
	   final String DRIVER = "com.mysql.jdbc.Driver";
	   static Connection conn = null;
	   
	   public static Connection connectSetup() {
		   
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;

	   }
	   
//	   public Connection init() throws ServletException {
//
//			// Database connection through Driver Manager
//			try {
//				Class.forName(DRIVER);
//				conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			} catch (ClassNotFoundException | SQLException e) {
//				e.printStackTrace();
//			}
//			return conn;
//
//		}

	

}
