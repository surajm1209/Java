import java.sql.*;
import java.util.Scanner;

public class UpdateOperation 
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
                System.out.print("Enter roll no which you wants to Update : ");
                int roll = sc.nextInt();

                String selectQuery= "Select * from student where Roll ="+roll;

                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(selectQuery);
                //Checking the operation status
                if(rs.next())
                {
                    //Retriving a data
                    String name=rs.getString("Name");
                    String city=rs.getString("City");
                    int age=rs.getInt("Age");
                    boolean doUpdate = false;

                    System.out.println("Note : Press 0 if you dont wants to update the detail :");
                    
                    //Check for Name
                    System.out.print("Name : "+ name +" :: Enter new Name : ");
                    String nm = sc.next();
                    if(!nm.equals("0"))
                    {
                         name = nm;
                         doUpdate = true;
                    }   

                    //Check for Age
                    System.out.print("Age  : "+ age +" :: Enter new Age : ");
                    int ag = sc.nextInt();
                    if(ag>0)
                    {
                         age = ag;
                         doUpdate = true;
                    }   

                    //Check for Name
                    System.out.print("City : "+ city +" :: Enter new City : ");
                    String ct = sc.next();
                    if(!ct.equals("0"))
                    {
                        city = ct;
                        doUpdate = true;
                    }
                    
                    if(doUpdate)
                    {
                        String UpdateQuery= "Update student set Name='"+name+"', Age="+age+",City='"+city+"' where Roll ="+roll;
                        stmt = con.createStatement();
                        stmt.executeUpdate(UpdateQuery);
                        System.out.println("Record Updated sucessfully");
                    }
                    else
                    {
                        System.out.println("Since there is no field to update to we are rejecting the request for roll: "+ roll);
                    }
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
