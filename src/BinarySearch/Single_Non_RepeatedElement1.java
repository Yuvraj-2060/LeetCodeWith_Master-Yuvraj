package BinarySearch;
import java.util.HashMap;
public class Single_Non_RepeatedElement1 {
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : nums) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (int key : countMap.keySet()) {
            if (countMap.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5,6,6,7,7};

        int ans = singleNonDuplicate(arr);
        System.out.println("Single Non-Repeated Element is: " + ans);
    }
}
