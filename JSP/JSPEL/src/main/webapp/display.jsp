<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
		<h1 style='color: blue; text-align: center'>Data Retrieved from
		Particular Scope :: ${requestScope.r }</h1>
	
	<h1 style='color: blue; text-align: center'>Data Retrieved from
			Particular Scope :: ${applicationScope.a }</h1>
		
		<h1 style='color: red; text-align: center'>
			The request object is :: ${request.method}<br />
			<br />
		
		</h1>
		<h1 style='color: red; text-align: center'>
			The session object is :: ${session.id}<br />
			<br />
		</h1>
		
		<h1 style='color: red; text-align: center'>
			The request object is :: ${pageContext.request.method}<br />
			<br />
		</h1>
		
		<h1 style='color: red; text-align: center'>
			The session object is :: ${pageContext.session.id}<br />
			<br />
		</h1>
		<h1>UserName is :: ${initParam.user }</h1>
		<h1>Password is :: ${initParam.password }</h1>
		<h1>URL is      :: ${initParam.url }</h1>	
	</body>
</html>