import java.util.Scanner;

public class Array1D {
    public static void main(String[] args) {
        //Creating an array for marks
		int marks[] = new int[5];

        //Careating an object of Scanner to take inout from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Get the inout or marks :");
        System.err.println("-----------------------------------------");
        for(int i=0; i< marks.length;i++)
        {
            System.out.println("Enter Mark fir subject "+ (i+1) + " : ");
            marks[i] = sc.nextInt();
        }

        System.err.println("\n The narks of the subject are as follows :");
        System.out.println("--------------------------------------------");

        //Retriving the data from the array
        for(int i=0; i<marks.length;i++)
        {
            System.out.println("Mark for the subject "+(i+1)+" : " + marks[i]);
        }
       
        sc.close();
	}
}
