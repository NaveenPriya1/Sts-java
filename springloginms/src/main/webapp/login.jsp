<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="login">
Username<input type="text" name="user"><br>
Password<input type="password" name="pwd"><br>
<input type="submit" value="login"> 
</form>
<h3>if the user is not registered</h3>
<form action="register.jsp">
<input type="submit" value="register">
</form>

</body>
</html>
