package BinarySearch;

public class Find_First_and_Last_PositionOf_X1 {
    static int[] searchRange(int[] nums, int target) {

        int lb = LowerBound(nums,nums.length,target);
        int up = UpperBound(nums,nums.length,target);

        if(lb==nums.length || nums[lb]!=target)
            return new int[]{-1,-1};
        return new int[]{lb,up-1};
    }

    static int LowerBound(int arr[], int n, int x){
        int ans=n;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid= low + (high-low)/2;

            if(arr[mid]>= x){
                ans=mid;
                high=mid-1;
            }
            else    low=mid+1;
        }
        return ans;
    }

    static int UpperBound(int arr[], int n, int x){
        int ans=n;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid= low + (high-low)/2;

            if(arr[mid]> x){
                ans=mid;
                high=mid-1;
            }
            else    low=mid+1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 4, 7, 8, 10};
        int n = 6, x = 5;
        int[] ans = searchRange(arr, x);
        System.out.println("The floor and ceil are: " + ans[0]+ " " + ans[1]);
    }
}
