<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%-- pageContext implicit object to perform attribute management in any scopes --%>
<%
	pageContext.setAttribute("p", "page");
	request.setAttribute("r", "request");
	session.setAttribute("s", "session");
	application.setAttribute("a", "application");
	
	pageContext.forward("./display.jsp");
%>
