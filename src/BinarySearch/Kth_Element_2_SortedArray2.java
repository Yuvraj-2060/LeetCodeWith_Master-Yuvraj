package BinarySearch;
import java.util.ArrayList;
import java.util.Arrays;

public class Kth_Element_2_SortedArray2 {
    static int kthElement2(int arr1[], int arr2[], int m, int n, int k) {
        if(m > n) {
            return kthElement2(arr2, arr1, n, m, k);
        }

        int low = Math.max(0,k-m), high = Math.min(k,n);

        while(low <= high) {
            int cut1 = (low + high) >> 1;
            int cut2 = k - cut1;
            int l1 = cut1 == 0 ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = cut2 == 0 ? Integer.MIN_VALUE : arr2[cut2 - 1];
            int r1 = cut1 == n ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = cut2 == m ? Integer.MAX_VALUE : arr2[cut2];

            if(l1 <= r2 && l2 <= r1) {
                return Math.max(l1, l2);
            }
            else if (l1 > r2) {
                high = cut1 - 1;
            }
            else {
                low = cut1 + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
//        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 3, 6, 7, 9));
//        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 4, 8, 10));
            int arr1[] = {2, 3,6,7,9};
            int arr2[] = {1,4,8,10};

        int x=4;
        System.out.println("The "+x+"th element is: "+kthElement2(arr1, arr2, arr1.length,arr2.length,x));
    }
}
