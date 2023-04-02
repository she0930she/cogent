<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%@ page import= "java.sql.*" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%= session.getAttribute("cogentname") %>

<div align= "center">
<%
//All JAVA code here to connect MySQL and Pull All REcords

	final String URL = "jdbc:mysql://localhost/batch65";
	final String USER = "root";
	final String PASSWORD = "12345678";
	final String DRIVER = "com.mysql.jdbc.Driver";
	Connection conn = null;
	
	try {
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	
	try {

		response.setContentType("text/html");
		out.println("<html><body>");
		out.println("<h3>Persons Details</h3>");
		out.println("<table border=1><tr>" + "<td><b>ID</b></td>" + "<td><b>Names</b></td>");

	
		Statement stmt = conn.createStatement();
		String sql = "select * from Persons;";
		ResultSet rs = stmt.executeQuery(sql);

	
		while (rs.next()) {
			int sno = rs.getInt("PersonID");
			String brand = rs.getString("LastName");
			out.println("<tr>" + "<td>" + sno + "</td>" + "<td>" + brand + "</td>" );

		}
		out.println("</table></body></html>");
		rs.close();
		stmt.close();
		out.close();

	} catch (SQLException e) {
		e.printStackTrace();
	}

%>




</div>

</body>
</html>