
public class IRHp {
    public static void printIRHP(int row)
    {
        for(int i=1;i<=row;i++)
        {
            // for(int x=row;x>=i;x--)
            // {
            //     System.out.print(" ");
            // }
            for(int x=1;x<=row-i;x++)
            {
                System.out.print(" ");
            }
            for(int x=1;x<=i;x++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
  public static void main(String[] args) {
    printIRHP(10);
  }  
}
