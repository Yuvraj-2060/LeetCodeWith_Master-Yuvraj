package String;

public class LargestOddNumber_IN_String {
    public static String largestOddNumber(String num) {

        for(int i=num.length()-1;i>=0;i--){
            if( (num.charAt(i)-'0') % 2 != 0){
                return num.substring(0,i+1);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String str ="523472";
        System.out.println("Largest Odd Number in String: "+largestOddNumber(str));
    }
}
