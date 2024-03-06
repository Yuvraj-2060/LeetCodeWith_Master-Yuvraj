package String;

import java.util.Stack;

public class Remove_Outermost_Parenthesis {
    public static String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)=='('){
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }
            else{
                bracket.pop();
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str ="(()())(())";

        String ans = removeOuterParentheses(str);
        System.out.println("After removal of outermost parentheses: " + ans);
    }
}
