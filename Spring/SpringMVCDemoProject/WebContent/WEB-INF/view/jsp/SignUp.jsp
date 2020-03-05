<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form  method = "POST" modelAttribute = "personForm">
		
		
		FirstName : <input type = "text" name = "firstName"/> &nbsp;
		LastName : <input type = "text" name = "lastName" /> &nbsp;
		Email : <input type = "text" name = "email" />
		Password : <input type = "password" name = "password" />
		<input type = "submit" name = "signup"/>
	</form>
</body>
</html>