<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<h3 style="color:blue;text-align:center"> This is first JSP project </h3>
	<h2 style="color:cyan;text-align:center"><% out.print("Welcome jo JSP first project"); %></h2>
	<%
		int a=10;
		int b=20;
		int c= a + b;
	%>
	<h3 style="color:green;text-align:center"> <%=c %></h3>
</body>
</html>