package BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Kth_Element_2_SortedArray1 {
    public static int kthElement1(ArrayList<Integer> arr1, ArrayList<Integer> arr2, int n, int m, int x) {

        ArrayList<Integer> finalArray = new ArrayList<>();
        int i=0; int j=0;

        while(i<n && j<m){
            if(arr1.get(i)<arr2.get(j))
                finalArray.add(arr1.get(i++));
            else
                finalArray.add(arr2.get(j++));
        }
        while(i<n)
            finalArray.add(arr1.get(i++));

        while(j<m)
            finalArray.add(arr2.get(j++));

        return finalArray.get(x-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(2, 3, 6, 7, 9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1, 4, 8, 10));

        int x=4;
        System.out.println("The "+x+"th element is: "+kthElement1(arr1, arr2, arr1.size(),arr2.size(),x));
    }
}
