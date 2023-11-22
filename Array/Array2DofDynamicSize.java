import java.util.Scanner;

public class Array2DofDynamicSize 
{
    public static void main(String[] args) 
    {		
		int[][] ar=new int[3][];//array declaration
        Scanner scan=new Scanner(System.in);

		ar[0]=new int[3];
		ar[1]=new int[4];
		ar[2]=new int[2];
		
        System.out.println("Getting the input for the marks :");
        System.out.println("-------------------------------------------------");
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.println("Enter marks of class "+ (i + 1) +" Student "+(j + 1));
				ar[i][j]=scan.nextInt();
			} 
			
		}

		System.out.println("The marks of the student are as follows :");
        System.out.println("-------------------------------------------------");
		for(int i=0; i<ar.length;i++)
		{
			for(int j=0; j<ar[i].length;j++)
			{
				System.out.println("Marks for class "+ (i + 1) +" Student "+(j + 1) + " is : "+ar[i][j]);
			}
			
		}		
		scan.close();
	}
}
