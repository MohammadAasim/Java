package MultiThreading;

public class Sleep extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            try {
                Thread.sleep(600);
            }catch (Exception e){
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Sleep obj = new Sleep();
        Sleep obj1 = new Sleep();

        obj.start();
        obj1.start();
    }
}
