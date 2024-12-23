import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        boolean flag=true;
       for(int i=2;i<x;i++)
       {
          if(x%i==0)
          {
            flag=false;
            break;
          }
       }
       if(flag==true)
       {
        System.out.println(x+" is prime number");
       }
       else{
        System.out.println(x+" is not prime number");
       }
    }
}
