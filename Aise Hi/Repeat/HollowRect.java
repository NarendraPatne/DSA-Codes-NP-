public class HollowRect {
    public static void printHR(int row,int col)
    {
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=col;j++)
            {
                if(i==1 || i==row || j==1 || j==col)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
    // for(int i=1;i<=4;i++)
    // {
    //     if(i==1 || i==4)
    //      System.out.println("******");
    //     else
    //      System.out.println("*    *");
    //        for(int j=1;j<=5;j++)
    //        {
    //         if(i==1 || i==4)
    //          System.out.println("******");
    //         else
    //          System.out.println("*    *");
    //        }
    // }
    printHR(10,8);
    }
}    
