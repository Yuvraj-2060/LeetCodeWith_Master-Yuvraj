package Array;

public class LongestConsecutiveElements1 {
    public static boolean linearSearch(int []a, int num) {
        int n = a.length; //size of array
        for (int i = 0; i < n; i++) {
            if (a[i] == num)
                return true;
        }
        return false;
    }
    public static int longestSuccessiveElements(int []a) {
        int n = a.length; //size of array
        int longest = 1;

        for (int i = 0; i < n; i++) {
            int x = a[i];
            int cnt = 1;
            //search for consecutive numbers using linear search:
            while (linearSearch(a, x + 1) == true) {
                x += 1;
                cnt += 1;
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int arr[] = {100, 102, 100,101,101, 4, 3, 2, 3, 2, 1, 1, 1, 2};

        System.out.println("Longest Successive Element is: "+ longestSuccessiveElements(arr));
    }
}
