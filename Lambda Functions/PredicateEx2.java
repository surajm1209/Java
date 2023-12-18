import java.util.function.Predicate;

class MyPredicate2 implements Predicate<String> 
{
    @Override
    public boolean test(String name) 
    {
        if (name.length() >= 3)
            return true;
        else
            return false;

    }
}
public class PredicateEx2 {
    public static void main(String[] args)
    {

        Predicate<String> p = new MyPredicate2();
        System.out.println(p.test("PWC"));//true
        System.out.println(p.test("CS"));//false
    }
}
