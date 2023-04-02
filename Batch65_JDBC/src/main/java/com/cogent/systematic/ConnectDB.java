package com.cogent.systematic;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	
	   static final String DB_URL = "jdbc:mysql://localhost/batch65";
	   static final String USER = "root";
	   static final String PASS = "12345678";
	   static Connection conn = null;
	   
	   public static Connection connectSetup() {
		   
			try {
				conn = DriverManager.getConnection(DB_URL, USER, PASS);

			} catch (SQLException e) {
				e.printStackTrace();
			}
			return conn;


	   }

}
