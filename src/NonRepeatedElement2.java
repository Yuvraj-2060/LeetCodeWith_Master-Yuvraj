import java.util.*;
public class NonRepeatedElement2 {
    public static int getSingleElement2(int []arr){
        Set<Integer> hs = new HashSet<>();

        for(int x: arr){
            if(hs.contains(x))
                hs.remove(x);
            else
                hs.add(x);
        }
        for(int x:hs){
            return x;
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 3, 4, 4};
        int k = 7;

        System.out.println(" "+ Arrays.toString(nums));
        System.out.println("Non Repeated Element Is: "+getSingleElement2(nums));

    }
}
