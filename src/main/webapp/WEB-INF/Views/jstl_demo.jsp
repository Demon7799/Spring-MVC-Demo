<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL Demo</title>
</head>
<body>
	<h1>${names}</h1>

	<br>
	<br>
	<hr>

	<c:forEach var="item" items="${characters}">
		<h2> Name :  ${item } 
		</h2> <br>
	</c:forEach>
</body>
</html>