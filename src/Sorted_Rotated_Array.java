
class Sorted_Rotated_Array {
    public static boolean check(int[] nums) {
        int n = nums.length;
        int cnt=0;


        for(int i=1;i<n;i++){
            if(nums[i-1]>nums[i])
                cnt++;
        }
        if(nums[n-1]>nums[0])
            cnt++;

        return cnt<=1;
    }

    public static void main(String[] args) {
        int nums1[] = {3,4,5,1,2};
        System.out.println(check(nums1));

        int nums2[] = {1,2,3,4,5};
        System.out.println(check(nums2));

        int nums3[] = {3,4,7,1,6};
        System.out.println(check(nums3));
    }
}

