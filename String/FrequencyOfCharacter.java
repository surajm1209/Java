import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String str;
        int[] freq = new int[26];
        //Arrays.fill(freq, 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string : ");
        str = sc.nextLine();
        System.out.println("Your string is : "+ str);

        //Removing the spaces form the string
        str = str.replace(" ", "");

        //Converting to Upppercase
        str = str.toUpperCase();

        for(int i=0; i<str.length();i++)
        {
            int index = str.charAt(i) - 65;
            if(freq[index] > 0)
                freq[index]++;
            else    
                freq[index]=1;
        }

        System.out.println("Frequencies are : ");
        for(int i=0; i<freq.length;i++)
        {
            if(freq[i] <= 0)
                continue;

            System.out.println(" " + (char)(i + 65) +" : "+freq[i]);

        }

        sc.close();
    }
}
