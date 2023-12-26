import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class ClobInsertionApp 
{

	private static Connection connection;

	static 
    {
        // Step1: loading and register the Driver
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } 
        catch (ClassNotFoundException ce) 
        {
            ce.printStackTrace();
        }
    }
	public static void getJdbcConnection() throws SQLException 
    {
        if(connection == null)
        {
            String url = "jdbc:mysql://127.0.0.1:3306/project_1";
            String user = "root";
            String password = "Suraj@1209";
            connection = DriverManager.getConnection(url, user, password);
        }
    }
	public static void main(String[] args) {

		// Resources used
		PreparedStatement pstmt = null;
		Scanner scanner = null;

		// variables used
		String name = null;
		String pdfLoc = null;

		try 
		{
			if(connection == null)
            {
                getJdbcConnection();
            }

			String sqlInsertQuery = "insert into cities(`name`,`history`) values(?,?)";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {
				scanner = new Scanner(System.in);

				// collecting the inputs
				if (scanner != null) {
					System.out.print("Enter the cityname :: ");
					name = scanner.next();

					System.out.print("Enter the textpath location :: ");
					pdfLoc = scanner.next();// D:\images\history.txt
				}

				// Set the input values to Query
				pstmt.setString(1, name);
				pstmt.setCharacterStream(2, new FileReader(new File(pdfLoc)));;

				// execute the query
				int rowAffected = pstmt.executeUpdate();
				System.out.println("No of rows inserted inserted is :: " + rowAffected);

			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			scanner.close();
		}
	}
}
