package Array.Sliding_Window;

import java.util.HashSet;


public class FruitIntoBasket_1 {
    public static int totalFruits(int N, int[] fruits) {

        int maxLen=0;
        for(int i=0;i<N;i++){
            HashSet<Integer> hs = new HashSet<>();
            for(int j=i;j<N;j++){
                hs.add(fruits[j]);

                if(hs.size()<=2){
                    maxLen = Math.max(maxLen, j-i+1);
                }
                else
                    break;
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int arr[] = {2,1,2};
        int n = arr.length;

        System.out.println(totalFruits(n, arr));
    }

}
