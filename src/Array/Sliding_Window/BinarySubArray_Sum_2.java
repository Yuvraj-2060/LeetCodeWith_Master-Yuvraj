package Array.Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class BinarySubArray_Sum_2 {

    public static int numSubarraysWithSum(int[] nums, int goal) {
         int n = nums.length;
         int result = 0;
         int prefixSum = 0;

         // Create a HashMap to store the frequency of prefix sums
         // The key represents the prefix sum, and the value represents its frequency.
         Map<Integer,Integer> map = new HashMap();

         // Initialize the frequency of prefix sum 0 to 1, as it's there initially
         map.put(0, 1);

         // Traverse through the array to calculate prefix sums and count subarrays
         for(int i = 0; i < n; i++) {
             prefixSum += nums[i];

             // Count the subarrays with the sum = prefixSum - goal, if any
             result += map.getOrDefault(prefixSum - goal, 0);

             // Update the frequency of the current prefix sum
             map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
         }

         // Return the total count of subarrays with the sum equal to the goal
         return result;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1};

        System.out.println(numSubarraysWithSum(arr, 2));
    }

}
