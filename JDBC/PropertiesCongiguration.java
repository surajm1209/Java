
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class PropertiesCongiguration {
    private PropertiesCongiguration() {
    }

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

    public static Connection getJdbcConnection() throws SQLException, IOException
    {

        // Take the data from properties file
        FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Desktop\\JavaGit\\Java\\JDBC\\application.properties");

        Properties properties = new Properties();
        properties.load(fis);
        
        // Step2. Establish the Connection
        Connection connection =DriverManager.getConnection(properties.getProperty("url"),properties.getProperty("username"),properties.getProperty("password"));

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