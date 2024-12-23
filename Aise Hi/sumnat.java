import java.util.*;
public class sumnat {
    public static void main(String[] args) {
        int n,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any Number:");
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Sum of First "+n+" Natural Numbers is:"+sum);
    }
}
