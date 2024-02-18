import java.util.Arrays;

public class MaxProduct_SubArray1 {
    public static int maxProduct(int[] nums) {
        int n = nums.length;
        int result = nums[0];

        for(int i=0;i<n;i++){
            int prod = nums[i];
            for(int j=i+1;j<n;j++){
                result = Math.max(result, prod);
                prod *= nums[j];
            }
            result = Math.max(result, prod);
        }
        return result;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3 , -2, 4};

        System.out.println(maxProduct(arr));
    }
}
