public class BreakStatement {
    public static void main(String args[])
    {
        // First label
        first:
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                if (i == 2 && j == 2) 
                {
                    // Using break statement with label
                    break first;
                }
                System.out.println(i + " " + j);
            }
        }
    } 
}
