public class IsAliveMethod extends Thread 
{
    public static int amount = 0;
    public void run() 
    {
        amount++;
    }
    public static void main(String[] args) 
    {
        IsAliveMethod thread = new IsAliveMethod();
        thread.start();
        
        // Wait for the thread to finish
        while (thread.isAlive()) 
        {
            System.out.println("Waiting...");
        }
        
        // Update amount and print its value
        System.out.println("Main: " + amount);
        amount++;

        System.out.println("Main: " + amount);
    }
}