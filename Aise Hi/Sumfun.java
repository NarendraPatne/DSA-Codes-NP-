import java.util.*;
public class Sumfun {
    public static int Sum(int a,int b){
        return a+b;
    }
 public static void main(String[] args) {
    int a,b;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a:");
    a=s.nextInt();
    System.out.println("Enter b:");
    b=s.nextInt();
    System.out.println("Addition:"+Sum(a,b));
 }   
}
