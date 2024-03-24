package Array;

import java.util.Arrays;

public class MaxProduct_SubArray2 {
    public static int subarrayWithMaxProduct(int []arr){
        int pre=1;
        int suf=1;
        int ans = Integer.MIN_VALUE;

        int n=arr.length;

        for(int i=0;i<n;i++){
            if(pre==0)  pre=1;
            if(suf==0)  suf=1;

            pre *=arr[i];
            suf *=arr[n-i-1];

            ans = Math.max(ans, Math.max(pre,suf));
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3 , -2, 4};
        System.out.println(subarrayWithMaxProduct(arr));
    }
}
