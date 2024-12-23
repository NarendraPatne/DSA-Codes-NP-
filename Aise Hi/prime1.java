import java.util.*;
public class prime1 {
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
    if(flag==1)
    {
        System.out.println(x+" is Prime Number");
    }
    else{
        System.out.println(x+" is not Prime Number");
    }
    }
   } 
