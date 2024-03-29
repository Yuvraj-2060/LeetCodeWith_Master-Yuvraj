package Array;

import java.util.Arrays;

public class NextGreaterElement2 {
    static void printNGE(int arr[], int n)
    {
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(arr[i] + " -- " + next);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8, 0, 1, 3};
        printNGE(arr,arr.length);
    }
}
