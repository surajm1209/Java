import java.util.Scanner;

public class ToUpperCase {
    public static void main(String[] args) 
    {		
       	String str,result ="";

       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your string here : ");     
        str = sc.nextLine();

        //Converting to upper-case
        for(int i=0;i<str.length();i++)
        {   
            char ch;
            if(str.charAt(i) >= 'a')
                ch = (char)(str.charAt(i) - 32);
            else 
                ch = (char)str.charAt(i);

            result+=ch;
        }
        System.out.println("UpperCase string is : "+result);   
        sc.close();
    }
}
