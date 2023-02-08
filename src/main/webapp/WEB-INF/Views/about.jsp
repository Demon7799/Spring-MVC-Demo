<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.* "%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About Page</title>
</head>
<body>
	<h1>About Page</h1>
	<h1>Getting Data from Controller using Model in View</h1>
	<hr><br>
	<%
	@SuppressWarnings("unchecked")
		List<String> weapons = (List<String>) request.getAttribute("Weapons");

	for (String items : weapons) {
	%>
	<h1>
		<%=items%>
	</h1>
	<%
	}
	%>
</body>
</html>