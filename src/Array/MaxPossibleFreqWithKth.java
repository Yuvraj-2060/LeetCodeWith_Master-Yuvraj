package Array;

import java.util.*;

class MaxPossibleFreqWithKth {
    public static int maxFrequency(int[] nums, int k) {
        int maxFrequency = 0;
        long currentSum = 0;

        Arrays.sort(nums); // Sort the array in ascending order

        for (int left = 0, right = 0; right < nums.length; ++right) {
            currentSum += nums[right];

            while (currentSum + k < (long) nums[right] * (right - left + 1)) {
                currentSum -= nums[left];
                left++;
            }

            maxFrequency = Math.max(maxFrequency, right - left + 1);
        }

        return maxFrequency;
    }
    public static void main(String[] args) {
        int []nums = {1,2,4};
        int k = 5;
        System.out.println(maxFrequency(nums,k));
    }
}

