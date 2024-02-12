import java.util.HashMap;
public class LongestSubArrayWithSum_Zero2 {
    public static int getLongestZeroSumSubarrayLength(int []arr){
        HashMap<Integer,Integer> hs = new HashMap<>();
        int sum=0;
        int max=0;

        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum==0){
                max=i+1;
            }
            else{
                if(hs.containsKey(sum)){
                    max = Math.max(max, i-hs.get(sum));
                }
                else
                    hs.put(sum, i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {};
        System.out.println("Maximum Subarray with sum zero is: "+getLongestZeroSumSubarrayLength(arr));
    }
}
