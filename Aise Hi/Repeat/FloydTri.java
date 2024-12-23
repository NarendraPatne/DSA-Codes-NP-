
public class FloydTri {
    public static void FloydTri(int row)
    {
        int x=1;
        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x+" ");
                x++;
            }
            System.out.println();
        }
    }
 public static void main(String[] args) {
    FloydTri(5);
 }    
}
