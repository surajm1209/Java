public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // default 16

        //Append Method
        sb.append("Suraj");
        sb.append(" ");
        sb.append("Mishra");
        System.out.println(sb);
        System.out.println(sb.capacity()); 

        //Inserting character sequence
        sb.insert(5, " J");
        System.out.println(sb);
        System.out.println(sb.capacity()); 

        //Replace character sequence
        sb.replace(6, 7, "Jayshankar");
        System.out.println(sb);
        System.out.println(sb.capacity());

        //Deleting the character sequence
        sb.delete(6, 17);
        System.out.println(sb);
        System.out.println(sb.capacity());
        
        //Reversing the string
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.capacity());
    }   
}
