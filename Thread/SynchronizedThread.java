class Display {
    public void wish(String name) {
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.print("Good morning:");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                }
                System.out.println(name);
            }
        }
    }
}

class MyThread extends Thread {
    Display d;
    String name;

    MyThread(Display d, String name) {
        this.d = d;
        this.name = name;
    }

    public void run() {
        d.wish(name);
    }
}

class SynchronizedThread {
    public static void main(String[] args) {
        Display d = new Display();
        MyThread t1 = new MyThread(d, "Suraj");
        MyThread t2 = new MyThread(d, "Mishra");
        t1.start();
        t2.start();
    }
}