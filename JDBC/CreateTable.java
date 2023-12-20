import java.sql.*;

public class CreateTable 
{
     public static void main(String[] args){
        try 
        {
            //Lodining the driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            //Configuring the connection perameter
            String url = "jdbc:mysql://127.0.0.1:3306/project_1";
            String user = "root";
            String password = "Suraj@1209";

            //Extablishing the connection
            Connection con = DriverManager.getConnection(url, user, password);
            if(!con.isClosed())
            {
                String query= "create table Strudent1(Roll int(4) primary key AUTO_INCREMENT, Name varchar(20),Age int(2),City varchar(20))";
             
                //Creating a statement
                Statement stmt = con.createStatement();

                //Executing a statement
                if(stmt.executeUpdate(query) > 0)
                {   
                    System.out.println("Table created suceesfully");
                }
                if(stmt.executeUpdate(query) > 0)
                {   
                    System.out.println("Unable to create a table");
                }
            }
            else
                System.out.println("Unable to connect with database");
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       
    }
}
