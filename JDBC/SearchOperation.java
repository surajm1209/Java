import java.sql.*;
import java.util.Scanner;

public class SearchOperation 
{
    public static void main(String[] args) 
    {
        
        try 
        {
            //Loading the driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Configuring the connection Parameter
            String url = "jdbc:mysql://127.0.0.1:3306/project_1";
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

                //Taking input from the user
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter roll no which you wants to Search : ");
                int roll = sc.nextInt();

                String query= "Select * from student where Roll ="+roll;

                //Creating a statement
                Statement stmt = con.createStatement();

                //executing a quesry
                ResultSet rs = stmt.executeQuery(query);

                //Checking the operation status
                if(rs.next())
                {
                    //Retriving a data
                    System.out.print("\tRoll\tName\tAge\tCity\n");
                    System.out.println("\t*********************************************");

                    System.err.print("\t"+ rs.getInt("Roll"));
                    System.err.print("\t" + rs.getString("Name"));
                    System.err.print("\t" +rs.getInt("Age"));
                    System.err.print("\t" + rs.getString("City"));
                    System.out.println();
                }
                else
                    System.out.println("Student does not  exist with roll : "+ roll);
                
                //closing the connection
                con.close();
                sc.close();
            } 
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }

    }
}
