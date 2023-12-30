import java.util.*;
import java.util.Scanner;

public class PascalTriangle_2 {
    public static void main(String[] args) {
        int row;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        List<List<Integer>> ans = getPascal(row);
        System.out.println(ans);
    }

    private static List<List<Integer>> getPascal(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        List<Integer> row, prev =null;

        for(int i=0;i<numRows;i++){
            row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if( j==0 || j==i)
                    row.add(1);
                else
                    row.add(prev.get(j-1)+prev.get(j));
            }
            prev = row;
            res.add(row);
        }
        return res;
    }
}
