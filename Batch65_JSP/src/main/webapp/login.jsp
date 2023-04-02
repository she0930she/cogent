<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>submit name here</title>
</head>
<body>
<div align="center">
<form action="success.jsp" method="get">
   Name: <input type="text" name="name">
  <br> <br> 
  
  Password: <input type="text" name="pass">
  <br> <br> 
  
    <br> 
  <input type="submit" value="submit">

</form>

<%@ include file="getData.jsp" %>

</div>


</body>
</html>