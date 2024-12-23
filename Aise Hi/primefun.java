import java.util.*;
public class primefun {
    public static void isPrime(int x)
    {
        if(x==2)
        {
            System.out.println(x);
            return;
        }
        else{
            for(int i=2;i<x;i++)
            {
                if(x%i==0)
                {
                    // System.out.println(x+" is not Prime Number");
                    return;
                }
            }
            System.out.println(x);
            return;
        }
    }
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        x=s.nextInt();
        for(int i=1;i<=x;i++)
        {
            isPrime(i);
        }
        // if(isPrime(x)==true)
        // {
        //     System.out.println(x+" is Prime Number");
        // }
        // else{
        //     System.out.println(x+" is not Prime Number");
        // }
    }
}
