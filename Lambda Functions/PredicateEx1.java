import java.util.function.Predicate;

class MyPredicate implements Predicate<Integer>
{
    @Override
    public boolean test(Integer i)
    {
        if (i>10)
            return true;
        else
            return false;
    }
}
public class PredicateEx1
{
    public static void main(String[] args)
    {
        Predicate<Integer> p =new MyPredicate();
        System.out.println(p.test(10));//false
        System.out.println(p.test(100));//true
    }
}
