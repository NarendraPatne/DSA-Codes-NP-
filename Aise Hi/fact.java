import java.util.*;
public class fact {
    public static int fac(int x)
    {
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        x=s.nextInt();
        System.out.println("Factorial is: "+fac(x));
    }
}
