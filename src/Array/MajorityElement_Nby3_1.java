package Array;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement_Nby3_1 {
    public static List< Integer > majorityElement(int []v) {
        List<Integer> ls = new ArrayList<>();
        int n =v.length;

        for(int i=0;i<n;i++){
            if(ls.size()==0 || ls.get(0)!=v[i]){
                int cnt=0;
                for(int j=0;j<n;j++){
                    if(v[i]==v[j]){
                        cnt++;
                    }
                }
                if(cnt>(n/3))
                    ls.add(v[i]);
            }
            if(ls.size()==2)
                break;
        }
        return ls;
    }

    public static void main(String[] args) {
        int arr[] = {2, 2, 1, 3, 1, 1, 3, 1, 1};
        System.out.println("Majority Element which is greater then N/3 in array is: "+ majorityElement(arr));
    }
}
