import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class DateInsertionApp 
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
		
		//variables used
		java.sql.Date sqlDob = null;
		java.sql.Date sqlDom = null;

		String name = null;
		String dob = null;
		String dom = null;

		try 
		{
			if(connection == null)
            {
                getJdbcConnection();
            }
			 
			String sqlInsertQuery = "insert into users values(?,?,?)";		
			pstmt = connection.prepareStatement(sqlInsertQuery);

			if (pstmt != null) 
			{
				scanner = new Scanner(System.in);

				// collecting the inputs
				if (scanner != null) {
					System.out.print("Enter the username :: ");
					name = scanner.next();

					System.out.print("Enter the dob(MM-dd-yyyy) :: ");
					dob = scanner.next();

					System.out.print("Enter the dom(yyyy-MM-dd) :: ");
					dom = scanner.next();
				}

				if (dob != null) {
					// Conversion of String to sqlDate
					SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
					java.util.Date uDate = sdf.parse(dob);

					long value = uDate.getTime();
					sqlDob = new java.sql.Date(value);
				}

				if (dom != null)
					sqlDom = java.sql.Date.valueOf(dom);

				// Set the input values to Query
				pstmt.setString(1, name);
				pstmt.setDate(2, sqlDob);
				pstmt.setDate(3, sqlDom);

				// execute the query
				int rowAffected = pstmt.executeUpdate();
				System.out.println("No of rows inserted inserted is :: " + rowAffected);

			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		scanner.close();
	}
}

