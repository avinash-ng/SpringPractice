<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Time : <%= java.util.Calendar.getInstance().getTime() %>
	<form method = "POST" modelAttribute="loginForm">
		Email : <input type = "text" name = "email" />
		Password : <input type = "text" name = "password" />
		<input type = "submit" value = "login" />
	</form>
	 
</body>