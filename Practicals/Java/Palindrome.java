import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n=0,rev=0,x=0,ld=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No:");
        n=s.nextInt();
        x=n;
        while(x>0)
        {
            ld=x%10;
            rev=(rev*10)+ld;
            x=x/10;
        }
        if(rev==n)
        {
            System.out.println(n+" is Palindrome Number");
        }else{
            System.out.println(n+" is Not Palindrome Number");
        }
    }   
}
