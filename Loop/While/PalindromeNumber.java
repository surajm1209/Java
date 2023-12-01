public class PalindromeNumber {
    public static void main(String args[])
    {  
        int sum=0,temp;    
        int number=454;       
        temp=number;  

        while(number>0)
        {    
            int remainder = number % 10;  
            sum=(sum*10)+remainder;    
            number=number/10;    
        }    
        if(temp==sum)    
            System.out.println("palindrome number ");    
        else    
            System.out.println("not palindrome");    
      }  
}
