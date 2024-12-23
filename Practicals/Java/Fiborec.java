public class Fiborec{
    static int n1=0,n2=1,n3=0;
    static void printFib(int count)
    {
        if (count>0) {
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
            printFib(count-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(n1);
        System.out.println(n2);
        printFib(5);
    }
}