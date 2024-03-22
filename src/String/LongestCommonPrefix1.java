package String;

public class LongestCommonPrefix1 {
    public static String longestCommonPrefix(String[] strs) {
        String str = "";
        if (strs == null || strs.length == 0)
            return str;

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            boolean match = true;

            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    match = false;
                    break;
                }
            }
            if (!match)
                break;
            else
                str += ch;
        }
        return str;
    }
    public static void main(String[] args) {
        String str1[]={"coding","codes","codenation"};
        System.out.println("The Longest Common Prefix Is: "+longestCommonPrefix(str1));
    }
}
