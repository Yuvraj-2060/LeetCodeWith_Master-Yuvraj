package String;
import java.util.Stack;
public class Remove_Outermost_Parenthesis2 {
    public static String removeOuterParentheses(String s) {

        StringBuilder sb = new StringBuilder("");
        int cnt=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')')
                cnt--;
            if(cnt>0)
                sb.append(s.charAt(i));
            if(s.charAt(i)=='(')
                cnt++;
        }
        return sb.toString();
}
    public static void main(String[] args) {
        //String str ="(()())(())";
        String str ="(()()()())(()())";


        String ans = removeOuterParentheses(str);
        System.out.println("After removal of outermost parentheses: " + ans);
    }
}
