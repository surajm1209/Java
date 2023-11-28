public class StringReverse {
    public static void main(String[] args) {
        String str = "Suraj Mishra";
        String rev="";

        System.out.println("Original String is :"+ str);
        for(int i=str.length()-1;i>=0;i--)
        {
            rev+= str.charAt(i);
        }
        System.out.println("Reverse of the string is :"+ rev);
    }
}
