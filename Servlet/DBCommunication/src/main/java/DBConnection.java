import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class DBConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	Connection connection = null;
	static 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded succesufully....");
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}

    public DBConnection() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @Override
	public void init() throws ServletException {
		System.out.println("Config object created and got the values from config object...\n\n");

		String url = getInitParameter("url");
		String username = getInitParameter("username");
		String password = getInitParameter("password");
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);

		try {
			connection = DriverManager.getConnection(url, username, password);
			if (connection != null) {
				System.out.println("Connection established succesfully....");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
    @Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<h1>Request type is :: " + request.getMethod() + "</h1>");

		Statement statement = null;
		ResultSet rs = null;
		try {
			statement = connection.createStatement();
			rs = statement.executeQuery("select * from student");
			out.println("<table><tr><th>Roll</th><th>Name</th><th>Age</th><th>City</th></tr>");
			while(rs.next())
            {
				out.println("<tr>");
				out.println("<td>"+rs.getInt("Roll")+"</td>");
				out.println("<td>"+rs.getString("Name")+"</td>");
				out.println("<td>"+rs.getInt("Age")+"</td>");
				out.println("<td>"+rs.getString("City")+"</td>");
                out.println("<tr>");
            }
			out.println("</table></body></html>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
