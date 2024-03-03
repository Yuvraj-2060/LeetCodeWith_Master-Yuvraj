package BinarySearch;

public class Search_In_Rotated_SortedArray2 {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int low=0; int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
                return mid;

            if(nums[low]==nums[mid] && nums[mid]==nums[high]){ // If nums[low] = nums[mid] = nums[high]
                low +=1;
                high -=1;
                continue;
            }
            if(nums[low] <= nums[mid]) // if left half is sorted
                if(nums[low]<= target && target<=nums[mid]) // if target lies in left half
                    high = mid-1;
                else
                    low=mid+1;
            else                        // if right half is sorted
                if(nums[mid]<=target && target<=nums[high]) // if target lies in right half
                    low=mid+1;
                else
                    high=mid-1;

        }
        return -1;
    }
    public static void main(String[] args) {
        //int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int[] arr = {3,3,1,3,3,3,3};
        int x = 3;
        int ans = search(arr, x);
        System.out.println("This Index Of "+x+": "+ans);
    }
}
