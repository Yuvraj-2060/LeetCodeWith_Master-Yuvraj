import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle_1 {

    private static int factorialOf(int num) {
        int fact =1;
        for (int i = 1; i <=num; i++) {
            fact = fact*i;
        }
        return fact;
    }

    private static int nCr(int n, int i) {
        int res =1;
        res = res*(factorialOf(n)/((factorialOf(n-i)*(factorialOf(i)))));
        return res;
    }
    private static List<Integer> getRows(int n) {
        List<Integer> rowList = new ArrayList<>();
        //rowList.add(1);
        for (int i = 1; i <=n; i++) {
            int res = nCr(n-1,i-1);
            rowList.add(res);
        }

        return rowList;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int n = sc.nextInt();

        List<List> finalList = new ArrayList<>();
        for (int i = 1; i <=n ; i++) {
            List<Integer> list = new ArrayList<>();
            list = getRows(i);
            finalList.add(list);
        }

        System.out.println(finalList);
    }

}
