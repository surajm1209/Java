import java.util.Scanner;
public class VowelAndContant {
    public static void main(String[] args) 
    {		
       	String str;
        String input;
        int vowel=0,contant=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your string here : ");
        input = sc.nextLine();
        //Removing the spaces
        str = input.replace(" ","");

        //Converting to all Upper case
        str = str.toUpperCase();

        for(int i=0; i< str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I')
                vowel++;

            else
                contant++;
        }
        
        System.out.println("Your String is : "+ input);
        System.out.println("Vowel : "+ vowel);
        System.out.println("Constant : "+ contant);
        sc.close();
	}
}	
