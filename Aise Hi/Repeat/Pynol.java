
public class Pynol {
    public static void numPyHalfInv(int row)
    {
        // for(int i=row;i>=1;i--)
        // {
        //     for(int j=1;j<=i;j++)
        //     {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=row-i+1;j++)
            {
                System.out.print(j+" r");
            }
            System.out.println();
        }
    }
   public static void main(String[] args) {
    numPyHalfInv(5);
   }
}
