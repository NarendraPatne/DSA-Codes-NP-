import java.util.*;
public class large3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A:");
        a=s.nextInt();
        System.out.println("Enter B:");
        b=s.nextInt();
        System.out.println("Enter C:");
        c=s.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is Greatest Number");
            }
            else{
                System.out.println(c+" is Greatest Number");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is Greatest Number");
            }
            else{
                System.out.println(c+" is Greatest Number");
            }
        }
    }
}
