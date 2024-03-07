package String;

import java.util.Stack;

public class ReverseWordInString2 {
    public static String reverseString(String str)
    {
        String s[] = str.split(" ");

        StringBuffer ans = new StringBuffer("");

        for(int i=s.length-1;i>=0;i--){
            ans.append(s[i]); ans.append(" ");
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "Hello Master Yuvraj";
        System.out.println("After Reversing Word: "+reverseString(str));
    }
}
