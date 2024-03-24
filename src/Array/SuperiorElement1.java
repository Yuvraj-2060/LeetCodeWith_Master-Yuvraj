package Array;

import java.util.*;
public class SuperiorElement1 {
    public static List< Integer > superiorElements(int []a) {
        List<Integer> ans = new ArrayList<>();

        int n = a.length;
        int max = Integer.MIN_VALUE;

        for(int i=n-1; i>=0;i--){
            if(a[i]>max){
                ans.add(a[i]);
                max = a[i];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] ={1, 2, 2, 1};
        List ls = superiorElements(arr);
        System.out.println("Superior Elements are: "+ls);
    }
}
