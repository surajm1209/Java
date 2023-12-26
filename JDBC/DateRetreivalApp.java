import java.sql.*;
import java.text.SimpleDateFormat;

public class DateRetreivalApp 
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
		ResultSet resultSet = null;
		int id = 1;

		try 
		{
			if(connection == null)
            {
                getJdbcConnection();
            }

			String sqlSelectQuery = "select id,name,dob,dom from users where id=?";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) {
				// setting input values
				pstmt.setInt(1, id);

				// executing the query
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) {
				// processing the resultSet
				if (resultSet.next()) {
					System.out.println("SID\tSNAME\tSDOB\t\tSDOM");
					int sid = resultSet.getInt(1);
					String sname = resultSet.getString(2);
					java.sql.Date sdob = resultSet.getDate(3);
					java.sql.Date sdom = resultSet.getDate(4);

					SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
					String strDob = sdf.format(sdob);
					String strDom = sdf.format(sdom);
					System.out.println(sid + "\t" + sname + "\t" + strDob + "\t" + strDom);

				} else {
					System.out.println("Record not available for the given id :: " + id);
				}

			}

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		} 

	}

}
