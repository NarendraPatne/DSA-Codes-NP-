import java.util.*;
public class rev {
    public static void main(String[] args) {
        int n,r=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        n=s.nextInt();
        // while(n>0)
        // {
        //     r=r*10+(n%10);
        //     n=n/10;
        // }
        // System.out.println("Reverse is:"+r);
        while(n>0)
        {
            System.out.print(n%10);
            n/=10;
        }
    }
}
