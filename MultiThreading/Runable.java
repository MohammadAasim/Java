package MultiThreading;

public class Runable extends Thread {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Threads 1 without using Lambda");
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        Runnable r2 = () -> {
            System.out.println("Threads 2 with Lamnda");
        };
        Thread t2 = new Thread(r2);
        t2.start();
    }
}
