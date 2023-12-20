import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StaticConfiguration 
{
    private StaticConfiguration() {}
    
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

    public static Connection getJdbcConnection() throws SQLException 
    {
        // Step2. Establish the Connection
        String url = "jdbc:mysql://127.0.0.1:3306/project_1";
        String user = "root";
        String password = "Suraj@1209";
        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("connection object created...");
        return connection;
    }

    public static void cleanUp(Connection con, Statement statement, ResultSet resultSet) throws SQLException 
    {
        // Step6. Close the resources
        if (con != null) {
            con.close();
        }
        if (statement != null) {
            statement.close();
        }
        if (resultSet != null) {
            resultSet.close();
        }
    }

    public static void main(String[] args)
    {
        try 
        {
            Connection con = getJdbcConnection();

            //checking if the the connection established or not
            if(con.isClosed())
            {
                System.out.println("Uanble to open the connection");
            }
            
            else
            {
                System.out.println("Connection Established");
                cleanUp(con, null, null);
            }    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       
    }
}