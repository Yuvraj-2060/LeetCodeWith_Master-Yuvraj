package BinarySearch;

public class Min_In_Rotated_Sorted_Array {
    public static int findMin(int []nums) {
        int low =0;
        int high =nums.length-1;
        int ans = Integer.MAX_VALUE;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[low]<=nums[high]){          // if the array is already sorted
                ans = Math.min(ans,nums[low]);
                break;
            }

            if(nums[low]<=nums[mid]){           // If left half is sorted
                ans = Math.min(ans, nums[low]);
                low=mid+1;
            }
            else{                               // If right half is sorted
                ans= Math.min(ans, nums[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};

        int ans = findMin(arr);
        System.out.println("The Mininmum Element In Rotated Sorted Array is: " + ans);
    }

}
