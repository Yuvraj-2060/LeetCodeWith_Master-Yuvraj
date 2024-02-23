import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement_Nby3_2 {
    public static List<Integer> majorityElement(int[] v) {

        List<Integer> ls = new ArrayList<>();
        int n = v.length;
        HashMap<Integer, Integer> hs = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (hs.containsKey(v[i]))
                hs.put(v[i], hs.get(v[i]) + 1);
            else
                hs.put(v[i], 1);
        }

        for (int key : hs.keySet()) {
            if (hs.get(key) > (n / 3)) {
                ls.add(key);
            }
        }

        return ls;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println("Majority Element which is greater then N/3 in array is: "+ majorityElement(arr));
    }
}
