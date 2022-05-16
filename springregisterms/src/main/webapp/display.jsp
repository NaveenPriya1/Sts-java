<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page import="com.example.springJpa.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Student s=(Student)request.getAttribute("studentobj");%>
<h1>registration is successfull with <%=s.getSuser() %></h1>
</body>
</html>
