public class Diamond {
    public static void printDiam(int r)
    {
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=r-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=(i*2)-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printDiam(15);   
    }
}
