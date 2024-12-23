import java.util.*;
public class primeton {
    public static void printPrime(int n)
    {
        for(int i=2;i<=n;i++)
        {  
            boolean flag=true;
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                {
                    flag=false;
                }
            }
            if(flag==true)
            {
                System.out.println(i);
            }
        }
        }
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        n=s.nextInt();
        System.out.println("--------");
        printPrime(n);
    }
}
