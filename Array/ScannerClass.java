import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) 
	{
		System.out.println("Please enter Number");
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		System.out.println("After taking data from console to program");
		System.out.println(a);
		scan.close();
	}
}
