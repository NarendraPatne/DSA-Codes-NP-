import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        int n;
        boolean flag=true;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter any Number:");
        n=s.nextInt();
        if(n==1)
        {
            
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                flag=false;
                break;
            }
        }
        if(flag==true)
        {
            System.out.println(n+" is Prime Number");
        }else{
            System.out.println(n+" is Not Prime");
        }
    }
}
