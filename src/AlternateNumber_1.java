import java.util.Arrays;

public class AlternateNumber_1 {
    public static int[] alternateNumbers(int []nums) {
        // Write your code here.
        int n=nums.length;
        int i=0;
        int j=0;

        int a[]= new int[n/2];
        int b[]= new int[n/2];

        for(int x=0;x<n;x++){
            if(nums[x]>0){
                a[i++]=nums[x];
            }
            else{
                b[j++]=nums[x];
            }
        }
        i=0;
        j=0;
        for(int x=0;x<n;x++){
            if(x%2==0){
                nums[x]=a[i++];
            }
            else{
                nums[x]=b[j++];
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, -3, -1, -2, 3};
        System.out.println("Maximum Subarray with sum zero is: "+ Arrays.toString(alternateNumbers(arr)));
    }
}
