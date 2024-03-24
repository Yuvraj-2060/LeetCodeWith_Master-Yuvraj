package Array;// Java implementation to find the length
// of longest subarray having sum k

class Largest_SubArray_K_Sum_1 {

    static int maxLen(int[] arr, int n, int k)
    {
        int maxlength = 0;

        for (int i = 0; i < n; i++) {
            int Sum = 0;
            for (int j = i; j < n; j++) {
                Sum += arr[j];
                if (Sum == k)
                    maxlength = Math.max(maxlength, j - i + 1);
            }
        }
        return maxlength;
    }
    public static void main(String args[])
    {
        //int[] arr = {5,-2,2,-8,1,7,10,23};
        int[] arr = {2,0,0,3};
        int n = arr.length;
        int k = 0;
        System.out.println("Length = " +
                maxLen(arr, n, k));
    }
}


