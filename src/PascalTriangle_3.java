import java.util.*;
import java.util.Scanner;

public class PascalTriangle_3 {

    public static int nCr(int n, int r) {
        long res = 1;
        // calculating nCr:
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }

    private static List<List<Integer>> getPascal(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        // Store the entire Pascal's triangle:
        for (int row = 1; row <= numRows; row++) {
            List<Integer> tempLst = new ArrayList<>(); // temporary list
            for (int col = 1; col <= row; col++) {
                tempLst.add(nCr(row - 1, col - 1));
            }
            ans.add(tempLst);
        }
        return ans;
    }

    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        List<List<Integer>> ans = getPascal(row);
        System.out.println(ans);
    }

}
