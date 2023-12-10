import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();

        //Adding Homegeneous data
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);

        //Adding Heterogeneous data
        al.add("Suraj");
        al.add('S');
        al.add(3.14);
        System.out.println(al);

        //Adding Element at specific location
        al.add(4,"Mishra");
        System.out.println(al);

        //removing element from specific index
        al.remove(5);
        System.out.println(al);

        //Adding an array inside another array
        ArrayList al1 = new ArrayList();
        al1.add(396321);
        al1.add("Bilimora");
        al.addAll(al1);
        System.out.println(al);

        //Removing an array from another array
        ArrayList al2 = new ArrayList();
        al2.add(396321);
        al2.add("Mishra");
        al.removeAll(al2);
        System.out.println(al);

    }
}
