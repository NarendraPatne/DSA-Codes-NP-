public class TrappedRW {
    public static int trappedRainwater(int arr[])
    {
        // Calculate left max boundary
        int leftMax[]=new int[arr.length];
        leftMax[0]=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            leftMax[i]=Math.max(leftMax[i-1], arr[i]);
        }
        // Calculate right max boundary
        int rightMax[]=new int[arr.length];
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            rightMax[i]=Math.max(rightMax[i+1], arr[i]);
        }
        // Calculate water level at each bar wlvl=min(leftmax,rightmax)
        int trappedWater=0;
        for(int i=0;i<arr.length;i++)
        {
            int waterLvl=Math.min(rightMax[i],leftMax[i]);
            trappedWater=trappedWater+(waterLvl-arr[i]); 
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int arr[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(arr));
    }
}
