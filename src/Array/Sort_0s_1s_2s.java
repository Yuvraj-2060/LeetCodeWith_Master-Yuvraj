package Array;//                     1). Better Approach Then Normal Sorting Method.

//Time Complexity: O(N) + O(N), where N = size of the array. First O(N) for counting the number of 0’s, 1’s, 2’s, and second O(N) for placing them correctly in the original array.

//        Space Complexity: O(1) as we are not using any extra space.
import java.util.Arrays;
public class Sort_0s_1s_2s {
    public static void sortColors(int[] nums) {
        int cntZero=0;
        int cntOne=0;
        int cntTwo=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                cntZero++;
            if(nums[i]==1)
                cntOne++;
            if(nums[i]==2)
                cntTwo++;
        }

        for(int i=0;i<cntZero;i++)
            nums[i]=0;
        for(int i=cntZero;i<cntZero+cntOne;i++)
            nums[i]=1;
        for(int i=cntZero+cntOne;i<nums.length;i++)
            nums[i]=2;

        System.out.println("After Sorting: "+ Arrays.toString(nums));


    }

    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        System.out.println("Before Sorting: "+ Arrays.toString(nums));
        sortColors(nums);
    }
}

