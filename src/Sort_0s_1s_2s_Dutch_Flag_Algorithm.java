//Time Complexity: O(N), where N = size of the given array.
//        Reason: We are using a single loop that can run at most N times.

//        Space Complexity: O(1) as we are not using any extra space.

import java.util.Arrays;
public class Sort_0s_1s_2s_Dutch_Flag_Algorithm {

    public static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){

            if(nums[mid]==0){
                nums[mid++] = nums[low];
                nums[low++] = 0;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[high];
                nums[high--] = 2;
            }
        }
        System.out.println("After Sorting: "+ Arrays.toString(nums));
    }
    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        sortColors(nums);
    }
}
