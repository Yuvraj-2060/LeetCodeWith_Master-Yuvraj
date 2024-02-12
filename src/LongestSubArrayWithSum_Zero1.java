public class LongestSubArrayWithSum_Zero1 {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        int n = arr.length;
        int max=0;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum +=arr[j];
                if(sum==0){
                    max= Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -2, -8, 1, 7, 10, 23};
        System.out.println("Maximum Subarray with sum zero is: "+getLongestZeroSumSubarrayLength(arr));
    }
}
