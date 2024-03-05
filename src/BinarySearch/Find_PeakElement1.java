package BinarySearch;
public class Find_PeakElement1 {
    public static int findPeakElement(int[] nums) {
        int n =nums.length;

        if(nums.length==1) return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;

        for(int i=1;i<n-1;i++){
            if(nums[i-1]<nums[i] && nums[i+1]<nums[i])
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 8, 4, 5,6};

        int ans = findPeakElement(arr);
        System.out.println("The Peak Element is: " + ans);
    }
}
