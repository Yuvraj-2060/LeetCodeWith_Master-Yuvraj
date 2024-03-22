package String;

import java.util.HashMap;
import java.util.Map;

public class Anagram1 {
    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> hs = new HashMap<>();

        for(char x: s.toCharArray()){
            hs.put(x, hs.getOrDefault(x,0)+1);
        }
        for(char x:t.toCharArray()){
            hs.put(x,hs.getOrDefault(x,0)-1);
        }
        for(int val:hs.values()){
            if(val!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        String str3 ="nagarar";

        System.out.println("Give String Is Anagram: "+isAnagram(str1,str3));
    }
}
