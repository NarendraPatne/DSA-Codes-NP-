public class Comm {
    static int ReverseNo(int n)
    {
        int x=0,rem=0,rev=0;
        x=n;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        if(args.length>0)
        {
            int n=Integer.parseInt(args[0]);
            System.out.println(ReverseNo(n));
        }else{
            System.out.println("No command line argrments");
        }
    }
}
