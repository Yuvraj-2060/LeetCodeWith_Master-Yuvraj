package String;
import java.util.Arrays;
public class Anagram2 {
    public static boolean isAnagram(String s, String t) {
        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);
        return Arrays.equals(charArrayS, charArrayT);
    }
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        String str3 ="nagarar";

        System.out.println("Give String Is Anagram: "+isAnagram(str1,str3));
    }
}
