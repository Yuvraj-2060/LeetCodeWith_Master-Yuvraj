package Array;

import java.util.Arrays;

public class Set_Zero_Matrix_1 {

    public static int[][] setZero(int[][] mat){
        int row = mat.length;    // Number of rows
        int col = mat[0].length;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j] == 0){
                    for (int r = 0; r < row; r++) {
                        if (mat[r][j] != 0)
                            mat[r][j] = -1;
                    }
                    for (int c = 0; c < col; c++) {
                        if (mat[i][c] != 0)
                            mat[i][c] = -1;
                    }
                }
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(mat[i][j] == -1)
                    mat[i][j] = 0;
            }
        }
        return mat;
    }
    public static void main(String[] args) {

        int arr[][] ={{0,1,2,0}, {3,4,5,2}, {1,3,1,5}};
        int updatedMatrix[][] = setZero(arr);
        System.out.println("Updated Matrix : "+ Arrays.deepToString(updatedMatrix));
    }
}
