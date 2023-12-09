public class ExteningThreadClass extends Thread 
{
    public void run() {
        System.out.println("This code is running in a thread");
    }
    public static void main(String[] args) 
    {
        ExteningThreadClass thread = new ExteningThreadClass();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
}