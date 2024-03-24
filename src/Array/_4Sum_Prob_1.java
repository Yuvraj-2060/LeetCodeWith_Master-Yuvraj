package Array;

import java.util.*;
class _4Sum_Prob_1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);

        Set<List<Integer>> sv = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    long x = (long) target - (long) nums[i] - (long) nums[j] - (long) nums[k];

                    if (Arrays.binarySearch(nums, k + 1, n, (int) x) >= 0) {
                        List<Integer> v = new ArrayList<>();
                        v.add(nums[i]);
                        v.add(nums[j]);
                        v.add(nums[k]);
                        v.add((int) x);
                        sv.add(v);
                    }
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>(sv);
        return res;
    }
        public static void main(String[] args) {
            _4Sum_Prob_1 obj = new _4Sum_Prob_1();
            int[] v = {1000000000,1000000000,1000000000,1000000000};

            List<List<Integer>> sum = obj.fourSum(v, -294967296);
            System.out.println("The unique quadruplets are");
            for (List<Integer> list : sum) {
                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
}
