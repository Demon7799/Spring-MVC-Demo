<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Services Page</title>
</head>
<body>
	<h1>
		Getting Values from Controller using <i>ModelAndView</i>
	</h1>
	<hr>
	<br>

	<%
	String str = (String) request.getAttribute("services");

	LocalDateTime current = (LocalDateTime) request.getAttribute("time");
	%>

	<h2><%=str%></h2>
	<br>
	<hr>

	<h2><%=current %></h2>

</body>
</html>