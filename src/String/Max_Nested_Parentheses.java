package String;

public class Max_Nested_Parentheses {
    public static int maxDepth(String s) {
        // Write your code here.
        int max = 0;
        int curr = 0;
        int n = s.length();

        for(int i = 0; i < n;i++){
            char c = s.charAt(i);

            if(c == '('){
                curr++;
                max = Math.max(max, curr);
            }
            else if(c == ')'){
                curr--;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        String str ="(2*(3*((4+6))))";

        int ans = maxDepth(str);
        System.out.println("The maximum nested parentheses: " + ans);
    }
}
