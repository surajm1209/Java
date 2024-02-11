<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import='java.sql.*'%>
<%!Connection connection = null;
	PreparedStatement pstmt1 = null;
	PreparedStatement pstmt2 = null;

	public void jspInit() {
		System.out.println("Bootstrapping the environment....");
		ServletConfig config = getServletConfig();
		String url = config.getInitParameter("url");
		String user = config.getInitParameter("user");
		String password = config.getInitParameter("password");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url, user, password);
			pstmt1 = connection.prepareStatement("insert into student(`Name`,`Age`,`City`) values (?,?,?)");
			pstmt2 = connection.prepareStatement("select* from student");
			System.out.println("Connection Established");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}%>

	<%
	String action = request.getParameter("s1");
	if (action.equalsIgnoreCase("register")) 
	{
		//take the data and perform insert operation
		String sname = request.getParameter("sname");
		String scity = request.getParameter("scity");
		String sage = request.getParameter("sage");
	
		pstmt1.setString(1, sname);
		pstmt1.setInt(2, Integer.parseInt(sage));
		pstmt1.setString(3, scity);
	
		int rowCount = pstmt1.executeUpdate();
		if (rowCount == 1) 
		{
			%>
				<h1 style='color: green; text-align: center;'>Student registered</h1>
			<%
		} 
		else 
		{
			%>
			<h1 style='color: red; text-align: center;'>Student not registered</h1>
			<%
		}
		%>
	
	<%
	} 
	else 
	{
		// Get the data from the database using select operation ResultSet
		ResultSet resultSet = pstmt2.executeQuery();
		%>
		<table bgcolor='pink' align='center' border='1'>
			<tr>
				<th>Roll</th>
				<th>Name</th>
				<th>City</th>
				<th>Age</th>
			</tr>
		
			<%
			while (resultSet.next()) 
			{
			%>
				<tr>
					<td><%=resultSet.getInt(1)%></td>
					<td><%=resultSet.getString(2)%></td>
					<td><%=resultSet.getString(4)%></td>
					<td><%=resultSet.getInt(3)%></td>
				</tr>
			<%
			}
			%>
		</table>
	<%
	}
%>