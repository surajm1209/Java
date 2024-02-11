<%!
	static{
		System.out.println("Servlet loading...");
	}
%>

<%!
	public void index_jsp(){
		System.out.println("Servlet Instantiation...");
	}
%>
<%@ page language ="java" session ="true"%>
<h1>The session object is :: <%= session%></h1>

