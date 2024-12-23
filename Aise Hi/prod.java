import java.util.*;
public class prod{
    public static int Pro(int a,int b)
    {
        return a*b;
    }
    public static void main(String[] args) {
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A:");
        a=s.nextInt();
        System.out.println("Enter B:");
        b=s.nextInt();
        System.out.println("Product of "+a+"*"+b+" is:"+Pro(a, b));
    }
}