class Resource{
    int data;
    boolean hasData=false;
    public synchronized void Produce(int val) throws InterruptedException
    {
        while(hasData)
        {
            wait();
        }
        data=val;
        System.out.println("Produced Data:"+data);
        hasData=true;
        notify();
    }
    public synchronized void Consume() throws InterruptedException
    {
        while (hasData==false) {
            wait();
        }
        System.out.println("Consumed Data:"+data);
        hasData=false;
        notify();
    }
}
 class Producer implements Runnable{
    Resource r;
    Producer(Resource r)
    {
        this.r=r;
    }
    public void run()   
    {
       try{
        for(int i=1;i<=5;i++)
        {
            r.Produce(i);
            Thread.sleep(200);
        }
       }catch(InterruptedException e)
       {
        e.printStackTrace();
       }
    }
}
 class Consumer implements Runnable{
    Resource r;
    Consumer(Resource r)
    {
        this.r=r;
    }
    public void run()
    {
        try{
            for(int i=1;i<=5;i++)
            {
                r.Consume();
                Thread.sleep(300);
            }
           }catch(InterruptedException e)
           {
            e.printStackTrace();
           }
    }
}
public class ProdCons {
    public static void main(String[] args) {
        Resource r=new Resource();
       Thread prod=new Thread(new Producer(r));
       Thread con=new Thread(new Consumer(r));
       prod.start();
       con.start();
    }
}
