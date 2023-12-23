import java.sql.*;
import java.util.Scanner;
public class ManueDrivenApp 
{
    
    private static Connection connection;
    public static Scanner sc;
    private ManueDrivenApp() {}
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

    public static void getAllStudents()
    {
        try 
        {
            if(connection == null)
            {
                getJdbcConnection();
            }
            String query= "select * from student";

            //Preparing a statement
            PreparedStatement stmt = connection.prepareStatement(query);

            //executing a quesry
            ResultSet rs = stmt.executeQuery();

            //Retriving a data
            System.out.println("\t----------------------------------------------");
            System.out.print("\tRoll\tName\tAge\tCity\n");
            System.out.println("\t----------------------------------------------");
            while(rs.next())
            {
                System.err.print("\t"+ rs.getInt("Roll"));
                System.err.print("\t" + rs.getString("Name"));
                System.err.print("\t" +rs.getInt("Age"));
                System.err.print("\t" + rs.getString("City"));
                System.out.println();
            }
            System.out.println("\t----------------------------------------------");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    public static void addStudent()
    {
        try 
        {    
            if(connection == null)
            {
                getJdbcConnection();
            }

            System.out.print("Enter the name of the student :: ");
            String sname = sc.next();
            System.out.print("Enter the age of the student :: ");
            int sage = sc.nextInt();
            System.out.print("Enter the City of the student :: ");
            String city = sc.next();

            //Creating a statement
            String sqlInsertQuery = String.format("insert into student(`Name`,`Age`,`City`) values ('%s',%d,'%s')", sname, sage, city);           
            PreparedStatement statement = connection.prepareStatement(sqlInsertQuery);
            
            int rowAffected = statement.executeUpdate(sqlInsertQuery);
            System.out.println("No of rows affected is :: " + rowAffected);
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
    } 

    public static void deleteStudent()
    {
        try 
        {
            if(connection == null)
            {
                getJdbcConnection();
            }
            //Taking input from the user
            System.out.print("Enter roll number which you wants to delete : ");
            int roll = sc.nextInt();

            String query= "delete from student where Roll ="+roll;

            //Creating a statement
            PreparedStatement stmt = connection.prepareStatement(query);

            //executing a quesry
            int rowCount = stmt.executeUpdate();

            //Checking the operation status
            if(rowCount > 0)
                System.out.println("Student is been deleted sucessfully.");
            else
                System.out.println("Student does not  exist with roll : "+ roll);

        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
       
        
    }

    public static void updateStudent()
    {
       try 
       {
            if(connection == null)
            {
                getJdbcConnection();
            }

            //Taking input from the user
            System.out.print("Enter roll no which you wants to Update : ");
            int roll = sc.nextInt();

            String selectQuery= "Select * from student where Roll ="+roll;

            PreparedStatement stmt = connection.prepareStatement(selectQuery);
            ResultSet rs = stmt.executeQuery();
            
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
                    stmt = connection.prepareStatement(UpdateQuery);
                    stmt.executeUpdate();
                    System.out.println("Record Updated sucessfully");
                }
                else
                {
                    System.out.println("Since there is no field to update to we are rejecting the request for roll: "+ roll);
                }
            }
            else
                System.out.println("Student does not  exist with roll : "+ roll);
       } 
       catch (Exception e) 
       {
            e.printStackTrace();
       }
    }

    
    public static void main(String[] args)
    {
        sc = new Scanner(System.in);
        while(true)
        {
            getAllStudents();
            System.out.println("1. Add new Student");
            System.out.println("2. Delete Student");
            System.out.println("3. Update Student");
            System.out.println("4. Exite application");
            System.out.print("Enter your choice : ");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    addStudent();
                    break;
                case 2:
                    deleteStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    sc.close();
                    System.exit(0);
            }

        }
       
    }
}
