import java.util.Arrays;

public class StringAnagram {
    public static void main(String[] args) {
		String s1="a gentle Man";
		String s2="elegant Man";

        //Removing the spaces
        s1 = s1.replace(" ", "");
        s2 = s2.replace(" ", "");

        //Converting to lowercase
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        //Converting String to array
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
		
        //Sorting an array
        Arrays.sort(a1);
        Arrays.sort(a2);

        // checking the content of an array
        if(Arrays.equals(a1, a2))
		    System.out.println("It's an anagram");
        else   
            System.out.println("Not an anagram");
    }
}
