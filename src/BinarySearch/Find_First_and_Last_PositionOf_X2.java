package BinarySearch;

public class Find_First_and_Last_PositionOf_X2 {
    public static int[] searchRange(int[] nums, int target) {

        int first = firstOccerence(nums, target);
        int last = lastOccerence(nums, target);

        return new int[]{first,last};

    }

    static int firstOccerence(int[] nums, int x){
        int first=-1;

        int n=nums.length;

        int low=0; int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==x){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return first;
    }
    static int lastOccerence(int[] nums, int x){
        int last=-1;

        int n=nums.length;

        int low=0; int high=n-1;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(nums[mid]==x){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]<x)
                low=mid+1;
            else
                high=mid-1;
        }
        return last;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 4;
        int[] ans = searchRange(arr, x);
        System.out.println("The First and Last Occerence Of: "+x+" is " + ans[0]+ " " + ans[1]);
    }
}
