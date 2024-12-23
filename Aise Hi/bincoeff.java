import java.util.*;
public class bincoeff {
    public static int fact(int x)
    {
        int f=1;
        for(int i=1;i<=x;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        int n,r;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter N:");
        n=s.nextInt();
        System.out.println("Enter R:");
        r=s.nextInt();
        System.out.println("Binomial Coefficient of N: "+n+" and R:"+r+" is:"+(fact(n)/(fact(r)*fact(n-r))));
    }
}
