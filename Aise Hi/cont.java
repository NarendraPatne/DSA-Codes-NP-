import java.util.*;
public class cont {
    public static void main(String[] args) {
        int i=1; 
        Scanner s=new Scanner(System.in);
        while(i==1 || i==0)
        {
            System.out.println("Enter 1 to continue 0 to skip and other number to break:");
            i=s.nextInt();
            if(i==0)
             continue;
            System.out.println("#^@#$^@$$^@$^@$^@^$^@");
        }
    }
}
