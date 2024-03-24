package Array;

//******************** O(n^2) using 2 for LOOP's *****************
public class LengthOfLargest_K_Sum1 {
    public static int getLongestSubarray(int []a, long k) {
        int n =a.length;
        int maxLen=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += a[j];
                if(sum==k)
                    maxLen = Math.max(maxLen,j-i+1);
            }
        }
        return maxLen;
    }

    public static void main(String args[])
    {
//        int[] arr = {5,-2,2,-8,1,7,10,23};
        int[] arr = {2,0,0,3};
        int n = arr.length;
        long k = 3;
        System.out.println("Length = " +getLongestSubarray(arr, k));
    }
}
