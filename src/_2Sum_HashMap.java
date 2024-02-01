import java.util.*;
public class _2Sum_HashMap {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }

        // No solution found
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target=9;

        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
}
