<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${name }Profile</title>
</head>
<body>
	<!--  
	<h3>
		Hey!
		<h1>${name }</h1>
	</h3>
	<h3>
		Email :
		<h1>${mail }</h1>
	</h3>
	<h3>
		Phone :
		<h1>${phone }</h1>
	</h3>
	
	-->
	<h3>
		Hey!
		<h1>${frmData.userName }</h1>
	</h3>
	<h3>
		Email :
		<h1>${frmData.userMail }</h1>
	</h3>
	<h3>
		Phone :
		<h1>${frmData.userPhone}</h1>
	</h3>
</body>
</html>