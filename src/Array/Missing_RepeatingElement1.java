package Array;

import java.util.Arrays;

public class Missing_RepeatingElement1 {

    public static int[] findMissingRepeatingNumbers(int []a) {
        int n = a.length; // size of the array
        int repeating = -1, missing = -1;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] == i) cnt++;
            }

            if (cnt == 2) repeating = i;
            else if (cnt == 0) missing = i;

            if (repeating != -1 && missing != -1)
                break;
        }
        int[] ans = {repeating, missing};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2};

        System.out.println(Arrays.toString(findMissingRepeatingNumbers(arr)));
    }
}
