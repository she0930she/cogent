<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Tag Example</title>

</head>
<body>

<h1>Hello</h1>>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<c:forEach var = "i" begin = "1" end = "5">
         Item <c:out value = "${i}"/><p>
</c:forEach>

</body>
</html>