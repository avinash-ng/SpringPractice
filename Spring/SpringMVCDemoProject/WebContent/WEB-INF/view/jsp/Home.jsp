<%-- This is a home page --%>



<%@ page language="java" contentType="text/html; charset=UTF-8"
     pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "signup/" action = "POST">
		<input type = "submit" value = "signup" />
	</form> 
	
	<form >
		<input type = "submit" value = "signin" onclick = 'window.history.go(-1); return false'/>
	</form>
</body>
</html>