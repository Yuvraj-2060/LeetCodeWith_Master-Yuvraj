public class Maxi_SubArray_Sum_KADANES_ALGO {
    public static int maxSubArray(int[] arr) {

        int maxi = Integer.MIN_VALUE; // maximum sum
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum > maxi) {
                maxi = sum;
            }
            // If sum < 0: discard the sum calculated
            if (sum < 0) {
                sum = 0;
            }
        }
        // To consider the sum of the empty subarray
        //if (maxi < 0) maxi = 0;
        return maxi;
    }

        public static void main(String[] args) {
            int arr[] ={-2,1,-3,4,-1,2,1,-5,4};
            int maxProfit = maxSubArray(arr);
            System.out.println("Maximum SubArray Sum Is : "+maxProfit);
        }
}
