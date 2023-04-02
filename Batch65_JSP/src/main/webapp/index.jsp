<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> Hello World</h1>

<%! int count = 44; %>
<% out.println("this number is: "+ count); %>
<%
	// java comments
%>
<hr>
<p></p>
<%! int data = 10; %>
<%  data = data+ 100; %>
<%= data %>
<%= "expression here: "+ data %>

</body>
</html>