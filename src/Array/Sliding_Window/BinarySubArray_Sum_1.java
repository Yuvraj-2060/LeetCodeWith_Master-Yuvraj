package Array.Sliding_Window;

public class BinarySubArray_Sum_1 {

    public static int numSubarraysWithSum(int[] nums, int goal) {
        int cnt=0;
        int n = nums.length;

        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum +=nums[j];

                if(sum==goal)  cnt++;
                if(sum>goal) break;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1,0,1,0,1};

        System.out.println(numSubarraysWithSum(arr, 2));
    }
}
