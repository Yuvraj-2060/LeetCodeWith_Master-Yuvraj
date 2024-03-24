package Array;

import java.util.*;
public class LongestConsecutiveElements2 {
    public static int longestSuccessiveElements(int []a) {
        if(a.length==0)
            return 0;
        Arrays.sort(a);

        int n =a.length;
        int cnt=0;
        int longest=1;
        int lastSmallest= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(a[i]-1==lastSmallest){
                cnt++;
                lastSmallest=a[i];
            }
            else if(lastSmallest != a[i]){
                cnt =1;
                lastSmallest=a[i];
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
