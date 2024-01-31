import java.util.*;
//************ You further Optimiszed this using [2 POINTER] Approach (but in that case your arrray should not have Negatives elements) ********************************
public class LengthOfLargest_K_Sum2 {
    public static int getLongestSubarray(int []a, long k) {
        HashMap<Long, Integer> preSumMap = new HashMap<>();
        long sum=0;
        int maxLen=0;
        int n=a.length;

        for (int i = 0; i < n; i++) {
            sum += a[i];
            if (sum == k)
                maxLen = Math.max(maxLen, i + 1);

            long rem = sum - k;

            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }
            if(!preSumMap.containsKey(sum))
                preSumMap.put(sum, i);
        }
        return maxLen;
    }

    public static void main(String args[])
    {
        int[] arr = {5,-2,2,-8,1,7,10,23};
        //int[] arr = {2,0,0,3}; k=3      ans: 3
        int n = arr.length;
        long k = 10;
        System.out.println("Length = " +getLongestSubarray(arr, k));
    }
}