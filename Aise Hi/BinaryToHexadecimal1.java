import java.util.Scanner;
class BinaryToHexa
{
int number;
void getNumber()
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the number: ");
number = Integer.parseInt(sc.nextLine(), 2);
}
void convert()
{
String hexa = Integer.toHexString(number);
System.out.println("Hexadecimal Value is: " + hexa); 
}
}
public class BinaryToHexadecimal1
{
public static void main(String args[])
{
BinaryToHexa btoh = new BinaryToHexa();
btoh.getNumber();
btoh.convert();
} }