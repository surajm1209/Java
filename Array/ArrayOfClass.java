class Fan
{
	int cost;
	String brand;
	int noOfWings;
}

public class ArrayOfClass 
{
	public static void main(String[] args) 
	{		
       Fan[] f= new Fan[3];
       
       f[0]=new Fan();
       f[1]=new Fan();
       f[2]=new Fan();
       
       f[0].brand="Havells";
       f[0].cost=10000;
       f[0].noOfWings = 4;

       System.err.println("I have a fan of "+f[0].brand+"company  with the cost of "+ f[0].cost + " and it hase "+f[0].noOfWings+" no of wings.");
	}

}
