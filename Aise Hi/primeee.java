import java.util.*;
public class primeee {
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        x=s.nextInt();
        int flag=1;
        for(int i=2;i<x;i++)
        {
            if(x%i==0)
            {
                flag=0;
                break;
            }
        }
        if(x==2 || flag==1)
        {
            System.out.println(x+" is prime number");
        }
        else
        {
            System.out.println(x+" is not Prime Number");
        }
    }
}
