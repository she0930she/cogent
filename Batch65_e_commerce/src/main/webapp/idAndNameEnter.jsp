<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP Actions Example</title>
</head>
<body>
<h1> Product Registration Page</h1>
 <form action="addpost" method="post">
   ID: <input type="id" name="id">
  <br> <br> 
  
  Product Name: <input type="text" name="name">
  <br> <br> 
  
   Product cost: <input type="text" name="cost">
  <br> <br>  
    Product discount: <input type="text" name="discount">
  <br> <br> 
    Product available: <input type="text" name="available">
  <br> <br> 
    Product sold: <input type="text" name="sold">
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