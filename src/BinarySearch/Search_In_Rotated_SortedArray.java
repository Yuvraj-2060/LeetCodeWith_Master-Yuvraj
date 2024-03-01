package BinarySearch;

import java.util.ArrayList;

public class Search_In_Rotated_SortedArray {
    public static int search(int[] nums, int target) {
            int low =0;
            int high =nums.length-1;

            while(low<=high){
                int mid= low + (high-low)/2;

                if(nums[mid]==target)
                    return mid;

                if(nums[low]<=nums[mid]) // Left part is sorted
                    if(nums[low]<=target && target<=nums[mid])
                        high=mid-1; // element exist
                    else
                        low=mid+1; // element doesn't exist

                else //// Right part is sorted
                    if(nums[mid]<=target && target<=nums[high])
                        low=mid+1; // element exist
                    else
                        high=mid-1; // element doesn't exist

            }
            return -1;
    }
    public static void main(String[] args) {
        int[] arr = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int x = 1;
        int ans = search(arr, x);
        System.out.println("This Index Of "+x+": "+ans);
    }
}
