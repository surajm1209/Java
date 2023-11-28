public class StringLiteralPool {
    public static void main(String[] args) 
    {
        String str1 = "Suraj Mishra";
        String str2 = new String("Suraj Mishra");
        String str3 = new String("Suraj Mishra");

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
    }
}
