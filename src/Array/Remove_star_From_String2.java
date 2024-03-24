package Array;

import java.util.*;
//1). Using Stack:
public class Remove_star_From_String2 {
    public static void main(String[] args) {
        System.out.println(removeStars("leet**code*e"));
    }
    static String removeStars(String s) {

        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '*')
            st.pop();
            else
            st.push(c);
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
        sb.append(c);
        }
        return sb.toString();
    }
}

//2). Using StringBuilder approach simulating a stack:

//public class Array.Remove_star_From_String2 {
//    public static void main(String[] args) {
//        System.out.println(removeStars("leet**code*e"));
//    }
//
//    static String removeStars(String s) {
//        StringBuilder sb = new StringBuilder();
//
//        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)=='*')
//                sb.deleteCharAt(sb.length()-1);
//            else
//                sb.append(s.charAt(i));
//        }
//
//        return sb.toString();
//    }
//}
