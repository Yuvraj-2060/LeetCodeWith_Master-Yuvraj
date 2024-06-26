package Array.Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket_2 {
    public static int totalFruits(int N, int[] fruits) {

       if(N<=2) return N;
       int maxLen=0;

       HashMap<Integer,Integer> hm = new HashMap<>();
       int left=0;

       for(int right=0;right<N;right++){
           hm.put(fruits[right], hm.getOrDefault(fruits[right],0)+1);

           while(hm.size()>2){
               hm.put(fruits[left], hm.get(fruits[left])-1);
               if(hm.get(fruits[left])==0){
                   hm.remove(fruits[left]);
               }
               left++;
           }
           maxLen=Math.max(maxLen,right-left+1);
       }

        return maxLen;
    }
    public static void main(String[] args) {
        int arr[] = {0, 1, 2, 2, 2, 2};
        int n = arr.length;

        System.out.println(totalFruits(n, arr));
    }
}
