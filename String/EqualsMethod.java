public class EqualsMethod {
    public static void main(String[] args) 
    {
        // The object created with New keyword will always creates a new object(With new memory location)
        String str1 = new String("Suraj Mishra");
        String str2 = new String("Suraj Mishra");
        String str3 = str1;

        boolean b1;

        // ==  will compare the object itself and not the actual values
        b1 = str1 == str2;
        System.out.println(b1);

        b1 = str1 == str3;
        System.out.println(b1);

        // equals() method will compare the actual values
        b1 = str1.equals(str2);
        System.out.println(b1);

        b1 = str1.equals(str3);
        System.out.println(b1);
    }
}
