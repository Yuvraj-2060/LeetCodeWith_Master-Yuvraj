import java.util.Arrays;

public class LeftRotatedArray {

    public static int[] rotateArray(int arr[], int k) {
        int size = arr.length;

        k %= size;
        int temp[] = new int[size];

        for(int i=0;i<size-k;i++){
            temp[i]=arr[i+k];
        }
        for(int i=size-k,j=0;i<size;i++,j++){
            temp[i]=arr[j];
        }

        return temp;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int k = 7;

        System.out.println("Before Rotation: "+Arrays.toString(nums));

        System.out.println("After Kth Rotation: "+Arrays.toString(rotateArray(nums,k)));


    }
}
