package Array;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement1 {
    public static long[] nextLargerElement(long[] arr, int n) {
        Stack<Long> st = new Stack<>();
        long ans[] = new long[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
//            if (!st.isEmpty() && st.peek() > arr[i]) {
//                ans[i] = st.peek();
//            }
//            else {
//                ans[i] = -1;
//            }  OR

            if(st.isEmpty())
                ans[i]=-1;
            else
                ans[i]=st.peek();

            st.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        long arr[] = {6, 8, 0, 1, 3};
        System.out.println(Arrays.toString(nextLargerElement(arr,arr.length)));
    }
}
