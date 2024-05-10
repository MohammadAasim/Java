package MultiThreading;

public class MultiThre extends Thread {
    public void run(){
        System.out.println("Priority of thread is "+Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {
        MultiThre obj = new MultiThre();
        obj.start();
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        obj.setPriority(Thread.NORM_PRIORITY);
        obj.setPriority(Thread.MAX_PRIORITY);
        obj.setPriority(Thread.MIN_PRIORITY);
        System.out.println(obj.isAlive());
    }
}
