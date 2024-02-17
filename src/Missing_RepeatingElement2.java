import java.util.*;
public class Missing_RepeatingElement2 {
    public static int[] findMissingRepeatingNumbers(int []arr) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++)
            map.put(arr[i] , map.getOrDefault(arr[i] , 0)+1);

        int a = 0 , b = 0;

        for(int i = 1; i<=arr.length; i++){
            if(map.containsKey(i))
                if(map.get(i) == 2)
                    b=i;

            if(!map.containsKey(i))
                a=i;
        }

        int[] ans = new int[2];
        ans[0] = b;
        ans[1] = a;

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2};

        System.out.println(Arrays.toString(findMissingRepeatingNumbers(arr)));
    }
}
