package Recursion;
public class PalindromicString {
    public static void main(String[] args) {
        String str1="ababa";
        String str2="abmpba";

        System.out.println("String '"+str1+"' is Palindromic String: "+isPalindrome(str1,0,str1.length()-1));
        System.out.println("String '"+str2+"' is Palindromic String: "+isPalindrome(str2,0, str2.length()-1));
    }

    private static boolean isPalindrome(String str, int l, int r) {
        if(l>=r)
            return true;
        if(str.charAt(l)!=str.charAt(r))
            return false;
        return isPalindrome(str,l+1,r-1);
    }

}
