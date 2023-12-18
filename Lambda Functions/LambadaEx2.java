import java.util.function.Predicate;

public class LambadaEx2 
{
    public static void main(String[] args)
    {
        Predicate<String> p = name -> name.length() >= 3;
        System.out.println(p.test("PWC"));//true
        System.out.println(p.test("CS"));//false
    }
}
