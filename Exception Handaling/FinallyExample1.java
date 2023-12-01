class Demo
{
	int disp()
	{
		try
		{
			System.out.println("Method started");
			return 10;
		}
		finally 
		{
			System.out.println("Method ending");
		}
	}
}
public class FinallyExample1 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.disp();
	}
}
