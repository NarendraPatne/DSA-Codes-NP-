import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        System.out.print("Enter Number:");
        int n=new Scanner(System.in).nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is:"+fact);
    }
}
