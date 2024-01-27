import java.util.*;
class RightRotatedArray {
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        int temp[] = new int[n];

        for(int i=0;i<n;i++){
            temp[(i+k)%(n)] = nums[i];
        }
//        for(int i=0;i<n;i++)
//            nums[i]=temp[i];
        return temp;

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 3;
        System.out.println("Before Rotation: "+Arrays.toString(nums));

        System.out.println("After Kth Rotation: "+Arrays.toString(rotate(nums,k)));
    }
}
