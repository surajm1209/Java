import java.io.*;
import java.sql.*;
import org.apache.commons.io.IOUtils;

/*
 * jar link ::  https://mvnrepository.com/artifact/commons-io/commons-io/2.8.0
 */
public class ClobRetreivalApp 
{
	private static Connection connection;

	static 
    {
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
	public static void main(String[] args) 
	{

		PreparedStatement pstmt = null;
		ResultSet resultSet = null;
		int id = 3;

		try 
		{
			if(connection == null)
            {
                getJdbcConnection();
            }

			String sqlSelectQuery = "select id,name,history from cities where id=?";
			if (connection != null)
				pstmt = connection.prepareStatement(sqlSelectQuery);

			if (pstmt != null) 
			{
				// setting input values
				pstmt.setInt(1, id);

				// executing the query
				resultSet = pstmt.executeQuery();
			}

			if (resultSet != null) 
			{

				// processing the resultSet
				if (resultSet.next()) 
				{
					System.out.println("ID\tNAME\t\tHISTORY");
					int sid = resultSet.getInt(1);
					String sname = resultSet.getString(2);
					Reader reader = resultSet.getCharacterStream(3);

					File file = new File("history_copied.txt");
					FileWriter writer = new FileWriter(file);

					// copying the data from is to fos
					IOUtils.copy(reader, writer);

					writer.close();
					System.out.println(sid + "\t" + sname + "\t" + file.getAbsolutePath());

				} 
				else 
				{
					System.out.println("Record not available for the given id :: " + id);
				}

			}

		}catch (Exception e) {
			e.printStackTrace();
		} 
	}

}
