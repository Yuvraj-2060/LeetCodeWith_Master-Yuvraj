import java.util.*;
public class Largest_SubArray_Sum_0_1 {
    static int maxLen(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {

            // accumulate sum
            sum += arr[i];

            // when subarray starts from index '0'
            if (sum == 0)
                maxLen = i + 1;

            // make an entry for 'sum' if it is not present in 'map'
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            // check if 'sum-k' is present in 'map' or not
            if (map.containsKey(sum )) {

                // update maxLength
                if (maxLen < (i - map.get(sum)))
                    maxLen = i - map.get(sum);
            }
        }

        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {5,-2,2,-8,1,7,10,23};
        System.out.println(maxLen(arr,arr.length));

    }
}


//_____________________________________________(2)____________________________________________________________

//public class Largest_SubArray_Sum_0 {
//    static int maxLen(int a[], int n)
//    {
//        int max = 0;
//        int sum = 0;
//        Map<Integer, Integer> sumMap = new HashMap<>();
//        sumMap.put(0, -1); // Initialize the map with sum 0 at index -1 (before the array)
//
//        for (int i = 0; i < n; i++) {
//            sum += a[i];
//
//            if (sumMap.containsKey(sum))
//                max = Math.max(max, i - sumMap.get(sum));
//            else
//                sumMap.put(sum, i);
//        }
//        return max;
//    }
//    public static void main(String[] args) {
//        int arr[] = {5,-2,2,-8,1,7,10,23};
//        System.out.println(maxLen(arr,arr.length));
//
//    }
//}

