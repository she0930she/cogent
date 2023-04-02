<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%@ page import= "com.cogent.entity.Persons" %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<div >
<h1>we have got your request</h1>
<h1>
<%
	String name = request.getParameter("name");
	out.println("welcome "+ name);

	
	// session object, from HttpSession
	session.setAttribute("cogentname", name);
	
	
	
	Persons e = new Persons();
	e.showImports();
	
%>
</h1>
<h2>
<%= session.getAttribute("cogentname") %>
</h2>

<form action="getData.jsp" method="get">
 <input type="submit" value="submit">
</form>

<div>

</body>
</html>









