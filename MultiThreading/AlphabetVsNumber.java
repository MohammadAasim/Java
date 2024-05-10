package MultiThreading;

class alphabet implements Runnable{
    public void run(){
        for(int i=65;i<=92;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Alphabet class ended!!!!");
    }
}
class number implements Runnable{
    public void run(){
        for(int i=1;i<=20;i++){
            System.out.println(i);
            try{
                Thread.sleep(600);
            }catch (Exception e){
                e.getMessage();
            }
        }
        System.out.println("Number class ended!!!!");
    }
}
public class AlphabetVsNumber {
    public static void main(String[] args) {
        alphabet a = new alphabet();
        number n = new number();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(n);

        t1.start();
        t2.start();
    }
}
