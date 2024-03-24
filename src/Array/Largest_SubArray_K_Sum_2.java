package Array;

import java.util.*;
public class Largest_SubArray_K_Sum_2 {
    static int lenOfLongSubarr(int[] arr, int n, int k)
    {
        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            // when subarray starts from index '0'
            if (sum == k)
                maxLen = i + 1;
            // make an entry for 'sum' if it is not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {
                if (maxLen < (i - map.get(sum - k)))
                    maxLen = i - map.get(sum - k);
            }
        }

        return maxLen;
    }
    public static void main(String args[])
    {
        //int[] arr = {5,-2,2,-8,1,7,10,23};
        int[] arr = {2,0,0,3};

        int n = arr.length;
        int k = 10;
        System.out.println("Length = " +lenOfLongSubarr(arr, n, k));
    }
}
