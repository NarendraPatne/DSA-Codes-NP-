import java.util.Arrays;
public class Revar{
    public static void main(String[] args) {
        int arr[]={4,5,6,8,2,5,6};
        int s=0,e=arr.length-1;
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------------");
        while(s<e)
        {
            int t=arr[s];
            arr[s]=arr[e];
            arr[e]=t;
            s++;
            e--;
        }
        System.out.println(Arrays.toString(arr));
    }
}