<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="income" scope="session" value="${4000}" />
	<c:if test="${income > 8000}">
		<p>
			My income is:
			<c:out value="${income}" />
		<p>
	</c:if>
	
	
<c:forEach var="j" begin="1" end="6">  
   Item <c:out value="${j}"/><p>  
</c:forEach> 
	
	
 <c:set var="url" value="10" scope="request"/>  
  <c:if test="${url<1}">  
     <c:redirect url="http://google.com"/>  
  </c:if>  
   <c:if test="${url>1}">  
     <c:redirect url="http://facebook.com"/>  
   </c:if>  



</body>
</html>