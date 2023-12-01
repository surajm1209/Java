import java.util.Scanner;

public class TryCatch 
{
	public static void main(String[] args) 
	{
		//Devide By Zero exception
		try 
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the first num to divide");
			int num1=scan.nextInt();
			System.out.println("Enter the 2nd num to divide");
			int num2=scan.nextInt();
			scan.close();

			int res=num1/num2;
			
			System.out.println("The res is "+ res);			
		}
		catch(Exception e)
		{
			System.out.println("You're trying to divide by zero illogical");
		}
	}

}
