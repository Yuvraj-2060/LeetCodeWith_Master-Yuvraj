import java.util.*;
public class LongestConsecutiveElements3 {
    public static int longestSuccessiveElements(int[] a) {
        int n = a.length;
        if (n == 0)
            return 0;

        int longest = 1;
        Set<Integer> set = new HashSet<>();

        // put all the array elements into set
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }

        // Find the longest sequence
        for (int it : set) {
            // if 'it' is a starting number
            if (!set.contains(it - 1)) {
                // find consecutive numbers
                int cnt = 1;
                int x = it;
                while (set.contains(x + 1)) {
                    x = x + 1;
                    cnt = cnt + 1;
                }
                longest = Math.max(longest, cnt);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {100, 102, 100,101,101, 4, 3, 2, 3, 2, 1, 1, 1, 2};

        System.out.println("Longest Successive Element is: "+ longestSuccessiveElements(arr));
    }
}
