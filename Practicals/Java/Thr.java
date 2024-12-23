 class Myth1 extends Thread{
    public void run() {
        while(true)
        {
            System.out.println("Thread 1 Running");
        }
    }
}
 class Myth2 extends Thread{
    public void run() {
        while(true)
        {
            System.out.println("Thread 2 Running");
        }
    }
}
class Myth3 implements Runnable{
    public void run() {
        while(true)
        {
            System.out.println("Fire");
        }
    }
}
public class Thr{
    public static void main(String[] args) {
        Myth1 t1=new Myth1();
        Myth2 t2=new Myth2();
        Myth3 bullet=new Myth3();
        Thread gun=new Thread(bullet);
        t1.start();
        t2.start();
        gun.start();
    }
}