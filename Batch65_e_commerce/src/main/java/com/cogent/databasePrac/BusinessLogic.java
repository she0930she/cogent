package com.cogent.databasePrac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class BusinessLogic {
	
	Connection conn;
	ArrayList <Product> ls = new ArrayList<>();
	
	void createData(
			int id, 
			String name, 
			float cost, 
			float discount, 
			int available,
			int sold
			) throws SQLException {
		
		conn=ConnectToDB.connectSetup();
		PreparedStatement stmt=conn.prepareStatement("INSERT INTO Products VALUES(?,?,?,?,?,?)");  
		stmt.setInt(1,id);//1 specifies the first parameter in the query  
		stmt.setString(2,name);  
		stmt.setFloat(3,cost);
		stmt.setFloat(4,discount);
		stmt.setInt(5,available);
		stmt.setInt(6,sold);
		
		int i=stmt.executeUpdate();  
		System.out.println(i+" records inserted"); 
		
	}
	
	
	void readData() throws SQLException {
		
		conn=ConnectToDB.connectSetup();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM Products");
		
		
		while (rs.next()) {
			// Display values
			System.out.print("ID: " + rs.getInt("ProductID"));
			System.out.println(", Name: " + rs.getString("ProductName"));
			
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
		
		System.out.println(" records read completed"); 
		
	}
	
	void specialCase(int id) {
		Product item = findItem(ls, id);
		
		if (item.getSold() < 10) {
			item.setDiscount(30);
		}
		
	}
	
	Product findItem( ArrayList<Product> arr, int id) {
		for (Product prod: arr) {
			if(prod.getId() == id) {
				return prod;
			}			
		}
		
		return new Product();
	}
	

}
