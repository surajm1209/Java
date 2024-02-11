<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!   
       	int factorial(int n)
		{  
			int fact = 1;
			for(int i=1 ;i<=n ;i++)
			{
				fact=fact*i;
			}
        	return fact;  
       }  
   %>  
   <h3 style="color:blue;text-align:center">
   		<% out.print("Factorial of 5 is : "); %>
   		<%=factorial(5) %>  
   </h3>
</body>
</html>