import java.util.*;
import java.math.*;
public class bintodec {
    public static void main(String[] args) {
        int x,pow=0,ld;
        double dec=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Binary Number: ");
        x=s.nextInt();
        while(x>0)
        {
        ld=x%10;
        x=x/10;
        dec=dec+(ld*Math.pow(2,pow));
        pow++;
        }
        System.out.println("Decimal Number is:"+dec);
    }
}
