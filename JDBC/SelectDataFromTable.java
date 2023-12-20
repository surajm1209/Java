import java.sql.*;
public class SelectDataFromTable 
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
                String query= "select * from student";

                //Preparing a statement
                PreparedStatement stmt = con.prepareStatement(query);

                //executing a quesry
                ResultSet rs = stmt.executeQuery();

                //Retriving a data
                System.out.print("\tRoll\tName\tAge\tCity\n");
                while(rs.next())
                {
                    System.err.print("\t"+ rs.getInt("Roll"));
                    System.err.print("\t" + rs.getString("Name"));
                    System.err.print("\t" +rs.getInt("Age"));
                    System.err.print("\t" + rs.getString("City"));
                    System.out.println();
                }
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
