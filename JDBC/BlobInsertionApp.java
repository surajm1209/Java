import java.io.*;
import java.sql.*;
import java.util.Scanner; 

public class BlobInsertionApp 
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

		PreparedStatement pstmt = null;
		Scanner scanner = null;

		// variables used
		String name = null;
		String imageLoc = null;

		try 
		{
			if(connection == null)
            {
                getJdbcConnection();
            }

			String sqlInsertQuery = "insert into persons(`name`,`image`) values(?,?)";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) {
				scanner = new Scanner(System.in);

				// collecting the inputs
				if (scanner != null) {
					System.out.print("Enter the username :: ");
					name = scanner.next();

					System.out.print("Enter the image location :: ");
					imageLoc = scanner.next();//  D:\images\nitin.JPG
				}

				// Set the input values to Query
				pstmt.setString(1, name);
				pstmt.setBinaryStream(2, new FileInputStream(new File(imageLoc)));

				// execute the query
				int rowAffected = pstmt.executeUpdate();
				System.out.println("No of rows inserted inserted is :: " + rowAffected);

			}

		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			scanner.close();
		}

	}

}
