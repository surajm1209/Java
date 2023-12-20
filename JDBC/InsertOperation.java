import java.sql.*;
import java.util.Scanner;

public class InsertOperation 
{
    public static void main(String[] args) throws SQLException 
    {
        
        //Configuring the connection perameter
        String url = "jdbc:mysql://127.0.0.1:3306/project_1";
        String user = "root";
        String password = "Suraj@1209";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the student :: ");
        String sname = scanner.next();
        System.out.print("Enter the age of the student :: ");
        int sage = scanner.nextInt();
        System.out.print("Enter the City of the student :: ");
        String city = scanner.next();

        //Extablishing the connection
        Connection con = DriverManager.getConnection(url, user, password);

        //Creating a statement
        Statement statement = con.createStatement();
        
        // Execute the Query and Process the resultSet
        String sqlInsertQuery = String.format("insert into student(`Name`,`Age`,`City`) values ('%s',%d,'%s')", sname, sage, city);
        System.out.println(sqlInsertQuery);

        int rowAffected = statement.executeUpdate(sqlInsertQuery);
        System.out.println("No of rows affected is :: " + rowAffected);

        //Close the resources
        statement.close();
        con.close();
        scanner.close();
        System.out.println("closing the resources...");
    }
}