import java.math.*;
import java.util.*;
public class dectobin {
    public static int dectbin(int x)
    {
        int bin=0;
        int rem,pow=0;
        while(x>0)
        {
            rem=x%2;
            x=x/2;
            bin=bin+(rem*(int)Math.pow(10, pow));
            pow++;
        }
        return bin;
    }
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Decimal Number:");
        x=s.nextInt();
        System.out.println("Binary of "+x+" is: "+dectbin(x));
    }
}
