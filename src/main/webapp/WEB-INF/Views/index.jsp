<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Index Page</h1>

	<%
		String name=(String)request.getAttribute("Name");
	%>
	<br>
	<br>
	<hr>
	<h1>User : <%=name %></h1>
	
	URLs ==> /home, /info, /service, /jstl, /form
</body>
</html>