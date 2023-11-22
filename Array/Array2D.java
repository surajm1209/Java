import java.util.Scanner;

public class Array2D 
{
    public static void main(String[] args)
    {
        int marks[][] = new int[5][5];
        Scanner sc  = new Scanner(System.in);

        System.out.println("Getting the input for the marks :");
        System.out.println("-------------------------------------------------");
        for(int i=0 ; i<marks.length; i++)
        {
            for(int j=0 ; j<marks[i].length; j++)
            {
                System.err.println("Enter the mark for Class "+(i+1)+" Student "+ (j+1) +" : ");
                marks[i][j] = sc.nextInt();
            }
        }

        System.out.println("The marks of the student are as follows :");
        System.out.println("-------------------------------------------------");
        for(int i=0 ; i<marks.length; i++)
        {
            for(int j=0 ; j<marks[i].length; j++)
            {
                System.err.println("Mark for Class " + (i+1) + " Student :" + (j+1) + " is :" + marks[i][j]);
            }
        }
        sc.close();
    }
   
}
