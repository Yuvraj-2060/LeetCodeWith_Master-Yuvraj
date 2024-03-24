package Array;

import java.util.Arrays;

public class NonRepeatedElement1 {
    public static int getSingleElement1(int []arr){
        int xorr = 0;

        for (int i = 0; i < arr.length; i++) {
            xorr = xorr ^ arr[i];
        }
        return (int)xorr;
    }
    public static void main(String[] args) {
        int nums[] = {8,8,9,9,10};
        int k = 7;

        System.out.println(" "+ Arrays.toString(nums));
        System.out.println("Non Repeated Element Is: "+getSingleElement1(nums));

    }
}
