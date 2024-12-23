import java.util.Scanner;

public class Hexa {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Binary Number:");
        int bin=Integer.parseInt(s.nextLine(),2);
        // System.out.println("Decimal:"+dec);
        // String bin=Integer.toBinaryString(dec);
        // System.out.println("Binary:"+bin);
        String hex=Integer.toHexString(bin);
        System.out.println(bin+" in Hexadecimal is:"+hex);
    }

}
