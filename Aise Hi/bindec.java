import java.util.*;
import java.math.*;
public class bindec {
    public static double bintdec(int x)
    {
        double dec=0;
        int pow=0,ld;
        while(x>0)
        {
            ld=x%10;
            x=x/10;
            dec=dec+(ld*Math.pow(2,pow));
            pow++;
        }
        return dec;
    }
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        x=s.nextInt();
        System.out.println("Decimal is:"+bintdec(x));
    }
}
