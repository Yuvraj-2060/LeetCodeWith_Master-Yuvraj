package BinarySearch;

import java.util.Arrays;

public class Find_Peak_In_2D_Matrix1 {
    public static int[] findPeakGrid(int [][]mat){
        // Write your code here.
        int m = mat.length;
        int n= mat[0].length;

        int max=0; int ans[] = new int[2];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]>max){
                    max=mat[i][j];
                    ans[0]=i; ans[1]=j;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] mat = {{10,20,15},{21,30,14},{7,16,32}};

        int ans[] = findPeakGrid(mat);
        System.out.println("The Peak Element is: " + Arrays.toString(ans));
    }
}
