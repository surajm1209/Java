import java.util.Scanner;

public class Array3D 
{
    public static void main(String[] args)
	{
	  Scanner sc=new Scanner(System.in);	  
	  int [][][] Suraj=new int[2][3][3];
	  
	  for(int i=0;i<Suraj.length;i++)
	  {
		  for(int j=0; j<Suraj[i].length;j++)
		  {
			  for(int k=0;k<Suraj[i][j].length;k++)
			  {
				  System.out.println("Enter marks of College "+ i+ " Class "+ j + " Student "+k);
				  Suraj[i][j][k]=sc.nextInt();
			  }
		  }
	  }
	  System.out.println("Marks stored are as follows");
	  for(int i=0;i<Suraj.length;i++)
	  {
		  for(int j=0; j<Suraj[i].length;j++)
		  {
			  for(int k=0;k<Suraj[i][j].length;k++)
			  {
				  System.out.print(Suraj[i][j][k] +" ");
			  }
			  System.out.println();
		  }
	  }

      sc.close();

	}
}
