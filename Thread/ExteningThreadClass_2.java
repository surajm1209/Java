class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println("child thread");

    }
}

class ExteningThreadClass {
    public static void main(String... args) 
    {
        MyThread t = new MyThread();    // Thread instantiation
        t.start();// starting a thread
        
        for (int i = 1; i <= 5; i++)
            System.out.println("Main Thread");

    }
}