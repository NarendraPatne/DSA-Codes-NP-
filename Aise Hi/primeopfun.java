import java.util.*;
public class primeopfun 
{
    public static boolean isPrime(int x)
    {
        
    }
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        x=s.nextInt();
        if(isPrime(x)==true)
        {
            System.out.println(x+" is Prime Number");
        }
        else{
           System.out.println(x+" is not Prime Number");
        }
    }
}
