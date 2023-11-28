import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
		int[] ar= {10,20,40,30,60,70,80,90};
		boolean flag=false;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key to be searched");
		int key=sc.nextInt();
		
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("Key "+key+" found at index " + i);
				flag=true;
				break;
			}
		}		
		if(flag==false)
		{
		    System.out.println("Key not found");
		}
        sc.close();
	}
}
