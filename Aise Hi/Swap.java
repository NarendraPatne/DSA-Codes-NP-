import java.util.*;
public class Swap {
    public static void swapt(int a,int b)
    {
        int c=a;
        a=b;
        b=c;
        System.out.println("Value of A:"+a+" B:"+b);
    }
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A:");
        a=s.nextInt();
        System.out.println("Enter B:");
        b=s.nextInt();
        // swapt(a, b);
        // int c=a;
        // a=b;
        // b=c; Using third variable
        a=a+b; // Without thrid variable
        b=a-b;
        a=a-b;
        System.out.println("Values after Swapping:");
        System.out.println("A:"+a+" B:"+b);
    }
}
