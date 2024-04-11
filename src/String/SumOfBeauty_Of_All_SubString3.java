package String;

import java.util.HashMap;

public class SumOfBeauty_Of_All_SubString3 {
    public static int beautySum(String s) {
        char[] ch = s.toCharArray();
        int count = 0;

        for (int i = 0; i < ch.length; i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < ch.length; j++) {
                map.put(ch[j], map.getOrDefault(ch[j], 0) + 1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (int val : map.values()) {
                    min = Math.min(min, val);
                    max = Math.max(max, val);
                }

                count += (max - min);
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String str = "aabcb"; // Ans: 5
//        String str = "aabcbaa"; // Ans: 17
        System.out.println("Sum Of Beauty Of All Sub String Is: "+ beautySum(str));
    }
}
