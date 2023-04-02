<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Actions Example</title>
</head>
<body>
<h1> Person Registration Page</h1>
 <form action="addpost" method="post">
   ID: <input type="id" name="id">
  <br> <br> 
  
  Last Name: <input type="text" name="name">
  <br> <br> 
    <br> 
  <input type="submit" value="add">
 </form>

<br>

 <form action="fetch" method="get">

    <br> 
  <input type="submit" value="get">
 </form>

 <form action="hi" method="get">
	
    <br> 
  <input type="submit" value="hi">
 </form>

</body>
</html>