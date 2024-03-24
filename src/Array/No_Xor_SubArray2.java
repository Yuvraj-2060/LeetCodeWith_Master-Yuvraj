package Array;

import java.util.HashMap;
//**************** Brute force approach O(N2) ****************************
public class No_Xor_SubArray2 {
    public static void main(String[] args) {
        int arr[] = {4,2,2,6,4};
        System.out.println(solve(arr,6));
    }
    static int solve(int[] A, int B) {
        int c=0;
        for(int i=0;i<A.length;i++){
            int current_xor = 0;
            for(int j=i;j<A.length;j++){
                current_xor^=A[j];
                if(current_xor==B) c++;
            }
        }
        return c;
    }
}
