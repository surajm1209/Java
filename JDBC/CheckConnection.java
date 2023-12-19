import java.sql.*;

public class CheckConnection {
    public static void main(String[] args){
        try 
        {
             //Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Configuring the the connectivity parameters
            String url ="jdbc:mysql://127.0.0.1:3306/project_1";
            String userName = "root";
            String password = "Suraj@1209";

            //Opening the connection with the database
            Connection con = DriverManager.getConnection(url,userName,password);

            //checking if the the connection established or not
            if(con.isClosed())
                System.out.println("Uanble to open the connection");
            else
            {
                System.out.println("Connection Established");

                //closing the connection
                con.close();
            }    
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       
    }
}
