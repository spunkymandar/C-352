<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<b>Welcome to JSP</b>

<% 
int x=10;

out.println(x);
%>

The value of x is : <b><%=x %></b>
</body>
</html>