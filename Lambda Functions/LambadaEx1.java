import java.util.function.Predicate;

public class LambadaEx1 {
    public static void main(String[] args)
    {
        Predicate<Integer> p =i->i>10;
        System.out.println(p.test(10));//false
        System.out.println(p.test(100));//true
    }
}
