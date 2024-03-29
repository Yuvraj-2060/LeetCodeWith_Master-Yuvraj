package Array;

import java.util.*;
public class Count_Of_Kth_SubArray_Sum2 {
    public static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        int k=3;

        System.out.println("Count of subarray sum equals to: "+k+" is "+subarraySum(arr,k));
    }
}
